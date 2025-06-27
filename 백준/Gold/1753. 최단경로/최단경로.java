import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Edge implements Comparable<Edge> {
        int node;
        int dist;

        Edge (int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Edge other) {
            return this.dist - other.dist;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) graph.add(new ArrayList<>());
        int[] dist = new int[V + 1];
        int INF = Integer.MAX_VALUE;
        Arrays.fill(dist, INF);
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
        }
        Queue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(K, 0));
        dist[K] = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            for (Edge next: graph.get(cur.node)) {
                int nextDist = dist[cur.node] + next.dist;
                if (nextDist < dist[next.node]) {
                    pq.offer(new Edge(next.node, nextDist));
                    dist[next.node] = nextDist;
                }
            }
        }
        for (int i = 1; i <= V; i++) {
            if (dist[i] == 2147483647) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }
}
