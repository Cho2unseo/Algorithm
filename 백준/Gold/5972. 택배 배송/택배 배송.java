import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Edge implements Comparable<Edge> {
        int node;
        int dist;

        Edge(int node, int dist) {
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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<Edge> pq = new PriorityQueue<>();
        dist[1] = 0;
        pq.offer(new Edge(1, 0));
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
        System.out.println(dist[n]);
    }
}
