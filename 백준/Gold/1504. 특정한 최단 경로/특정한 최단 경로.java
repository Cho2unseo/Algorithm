import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Edge implements Comparable<Edge> {
        int node;
        long dist;

        Edge(int node, long dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Edge o) {
            return (int) (this.dist - o.dist);
        }
    }

    static int INF = Integer.MAX_VALUE;
    static int n;
    static long[] dist = new long[801];
    static List<List<Edge>> graph = new ArrayList<>();

    static long dijkstra(int start, int end) {
        Arrays.fill(dist, INF);
        Queue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            for (Edge next: graph.get(cur.node)) {
                long nextDist = dist[cur.node] + next.dist;
                if (nextDist < dist[next.node]) {
                    dist[next.node] = nextDist;
                    pq.offer(new Edge(next.node, nextDist));
                }
            }
        }
        return dist[end];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        long res1 = 0;
        res1 += dijkstra(1, v1) + dijkstra(v1, v2) + dijkstra(v2, n);
        long res2 = 0;
        res2 += dijkstra(1, v2) + dijkstra(v2, v1) + dijkstra(v1, n);
        long res = Math.min(res1, res2);
        if (res >= INF) System.out.println(-1);
        else System.out.println(res);
    }
}
