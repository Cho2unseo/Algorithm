import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int ans = Integer.MAX_VALUE;
    static int person;

    static int bfs(int start, int n, List<List<Integer>> graph) {
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] isVisited = new boolean[n + 1];
        int count = 0;
        isVisited[start] = true;
        queue.offer(new int[] {start, 0});
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int next: graph.get(cur[0])) {
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    count += cur[1] + 1;
                    queue.offer(new int[] {next, cur[1] + 1});
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 1; i <= n; i++) {
            int res = bfs(i, n, graph);
            if (ans > res) {
                ans = res;
                person = i;
            }
        }
        System.out.println(person);
    }
}
