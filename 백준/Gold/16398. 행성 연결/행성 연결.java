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
        int n = Integer.parseInt(br.readLine());
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                j++;
                if (a == 0) continue;
                graph.get(i).add(new int[] {j, a});
                graph.get(j).add(new int[] {i, a});
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        boolean[] isVisited = new boolean[n + 1];
        isVisited[1] = true;
        for (int[] edge: graph.get(1)) pq.offer(new int[] {edge[0], edge[1]});
        long min = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (isVisited[cur[0]]) continue;
            isVisited[cur[0]] = true;
            min += cur[1];
            for (int[] edge: graph.get(cur[0])) pq.offer(new int[] {edge[0], edge[1]});
        }
        System.out.println(min);
    }
}
