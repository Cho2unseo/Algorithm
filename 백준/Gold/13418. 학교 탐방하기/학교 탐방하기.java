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
        int min = 0;
        int max = 0;
        List<List<int[]>> graph = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> e2[1] - e1[1]);
        PriorityQueue<int[]> pq2 = new PriorityQueue<>((e1, e2) -> e1[1] - e2[1]);
        boolean[] isVisited = new boolean[n + 1];
        boolean[] isVisited2 = new boolean[n + 1];
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (c == 0) c = 1;
            else c = 0;
            graph.get(a).add(new int[] {b, c});
            graph.get(b).add(new int[] {a, c});
        }
        isVisited[0] = true;
        isVisited2[0] = true;
        for (int[] edge: graph.get(0)) {
            pq.offer(new int[] {edge[0], edge[1]});
            pq2.offer(new int[] {edge[0], edge[1]});
        }
        int count = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int v = cur[0];
            int c = cur[1];
            if (isVisited[v]) continue;
            isVisited[v] = true;
            max += c;
            count++;
            if (count == n) break;
            for (int[] e: graph.get(v)) pq.offer(new int[] {e[0], e[1]});
        }
        count = 0;
        while (!pq2.isEmpty()) {
            int[] cur = pq2.poll();
            int v = cur[0];
            int c = cur[1];
            if (isVisited2[v]) continue;
            isVisited2[v] = true;
            min += c;
            count++;
            if (count == n) break;
            for (int[] e: graph.get(v)) pq2.offer(new int[] {e[0], e[1]});
        }
        max = max * max;
        min = min * min;
        System.out.println(max - min);
    }
}
