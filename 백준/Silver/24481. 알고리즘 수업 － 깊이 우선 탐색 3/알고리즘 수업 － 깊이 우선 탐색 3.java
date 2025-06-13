import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.util.Collections.sort;

public class Main {

    static boolean[] isVisited;
    static int[] ans;
    static List<List<Integer>> graph;

    static void recursive(int depth, int cur) {
        isVisited[cur] = true;
        ans[cur] = depth;
        for (int i = 0; i < graph.get(cur).size(); i++) {
            int next = graph.get(cur).get(i);
            if (!isVisited[next]) {
                recursive(depth + 1, next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for (int i = 0; i <= n; i++) {
            sort(graph.get(i));
        }
        isVisited = new boolean[n];
        ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = -1;
        recursive(0, r - 1);
        for (int i: ans) System.out.println(i);
    }

}
