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
        int x = Integer.parseInt(st.nextToken());
        int[] dist = new int[n + 1];
        int[] r_dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(r_dist, Integer.MAX_VALUE);
        List<List<Edge>> graph = new ArrayList<>();
        List<List<Edge>> r_graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
            r_graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
            r_graph.get(v).add(new Edge(u, w));
        }
        Queue<Edge> pq = new PriorityQueue<>();
        Queue<Edge> r_pq = new PriorityQueue<>();
        pq.offer(new Edge(x, 0));
        r_pq.offer(new Edge(x, 0));
        dist[x] = 0;
        r_dist[x] = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            for (Edge next: graph.get(cur.node)) {
                int nextDist = dist[cur.node] + next.dist;
                if (dist[next.node] > nextDist) {
                    pq.offer(new Edge(next.node, nextDist));
                    dist[next.node] = nextDist;
                }
            }
        }
        while (!r_pq.isEmpty()) {
            Edge cur = r_pq.poll();
            for (Edge next: r_graph.get(cur.node)) {
                int nextDist = r_dist[cur.node] + next.dist;
                if (r_dist[next.node] > nextDist) {
                    r_pq.offer(new Edge(next.node, nextDist));
                    r_dist[next.node] = nextDist;
                }
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
//            System.out.println(dist[i] + " " + r_dist[i]);
            max = Math.max(dist[i] + r_dist[i], max);
        }
        System.out.println(max);
    }
}
