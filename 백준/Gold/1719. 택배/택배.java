import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Edge implements Comparable<Edge> {
        int node;
        int dist;

        Edge(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Edge o) {
            return this.dist - o.dist;
        }
    }

    private static void dijkstra(int start) {
        Queue<Edge> pq = new PriorityQueue<>();
        dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        pq.offer(new Edge(start, 0));
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            if (dist[cur.node] < cur.dist) continue;
            for (Edge next: graph.get(cur.node)) {
                if (dist[next.node] > cur.dist + next.dist) {
                    dist[next.node] = cur.dist + next.dist;
                    pq.offer(new Edge(next.node, cur.dist + next.dist));
                    min[next.node][start] = cur.node;
                }
            }
        }
    }

    static int n;
    static int m;
    static List<List<Edge>> graph;
    static int[] dist;
    static int INF = 987654321;
    static int[][] min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }
        min = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) dijkstra(i);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) System.out.print("- ");
                else System.out.print(min[i][j] + " ");
            }
            System.out.println();
        }
    }
}
