import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= d; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if (u <= d && v <= d) graph.get(u).add(new int[] {v, w});
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        queue.offer(new int[] {0, 0});
        int[] dist = new int[d + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            if (dist[p[0]] >= p[1]) {
                if (p[0] + 1 <= d && dist[p[0] + 1] > p[1] + 1) {
                    dist[p[0] + 1] = p[1] + 1;
                    queue.offer(new int[] {p[0] + 1, p[1] + 1});

                }
                for (int[] a: graph.get(p[0])) {
                    if (p[1] + a[1] < dist[a[0]]) {
                        dist[a[0]] = p[1] + a[1];
                        queue.offer(new int[] {a[0], p[1] + a[1]});
                    }
                }
            }
        }
        System.out.println(dist[d]);
    }
}
