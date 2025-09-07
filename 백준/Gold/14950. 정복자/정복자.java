import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        List<List<int[]>> graph = new ArrayList<>();
        boolean[] isVisited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new int[] {b, c});
            graph.get(b).add(new int[] {a, c});
        }
        isVisited[1] = true;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int count = 0;
        int sum = 0;
        for (int[] edge: graph.get(1)) pq.offer(new int[] {edge[0], edge[1]});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (isVisited[cur[0]]) continue;
            isVisited[cur[0]] = true;
            sum += cur[1] + count * t;
            count++;
            for (int[] edge: graph.get(cur[0])) pq.offer(new int[] {edge[0], edge[1]});
        }
        System.out.println(sum);
    }
}
