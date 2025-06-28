import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Edge implements Comparable<Edge> {
        int node;
        int cost;

        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge other) {
            return this.cost - other.cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        List<List<Edge>> graph = new ArrayList<>();
        int[] dist = new int[n + 1];
        boolean[] isVisited = new boolean[n + 1];
        int INF = Integer.MAX_VALUE;
        Arrays.fill(dist, INF);
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        Queue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            if (!isVisited[cur.node]) {
                for (Edge next: graph.get(cur.node)) {
                    int nextDist = dist[cur.node] + next.cost;
                    if (nextDist < dist[next.node]) {
                        pq.offer(new Edge(next.node, nextDist));
                        dist[next.node] = nextDist;
                    }
                    isVisited[cur.node] = true;
                }
            }
        }
        System.out.println(dist[end]);
    }
}
