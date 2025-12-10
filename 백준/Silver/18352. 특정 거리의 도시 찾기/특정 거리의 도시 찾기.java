import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] dist = new int[n + 1];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        Arrays.fill(dist, -1);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        Queue<Integer> queue = new ArrayDeque<>();
        dist[x] = 0;
        queue.offer(x);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int a: graph.get(cur)) {
                if (dist[a] == -1) {
                    dist[a] = dist[cur] + 1;
                    queue.offer(a);
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            if (dist[i] == k) {
                System.out.println(i);
                cnt++;
            }
        }
        if (cnt == 0) System.out.println(-1);
    }
}
