import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Node {
        int node;
        int dist;

        Node(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    static ArrayList<ArrayList<Integer>> graph;
    static int[] count;
    static Queue<Node> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        queue = new ArrayDeque<>();
        queue.offer(new Node(1, 0));
        count = new int[n + 1];
        count[1] = 0;
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (int a : graph.get(cur.node)) {
                if (count[a] == 0) {
                    queue.offer(new Node(a, cur.dist + 1));
                    count[a] = cur.dist + 1;
                }
            }
        }
        int max = 0;
        int idx = 0;
        int cnt = 0;
        count[1] = 0;
        for (int i = 1; i <= n; i++) max = Math.max(max, count[i]);
        for (int i = 1; i <= n; i++) {
            if (count[i] == max) {
                cnt++;
                if (idx == 0) idx = i;
            }
        }
//        for (int i = 1; i <= n; i++) System.out.println(count[i]);
        System.out.println(idx + " " + max + " " + cnt);
    }
}
