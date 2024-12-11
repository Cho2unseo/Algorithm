import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> list[];
    static int n;
    static boolean[] isVisited;
    static int[] parent;

    static void dfs(int start) {
        isVisited[start] = true;
        for (int i: list[start]) {
            if (!isVisited[i]) {
                parent[i] = start;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        isVisited = new boolean[n + 1];
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) list[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        dfs(1);
        for (int i = 2; i <= n; i++) System.out.println(parent[i]);
    }
}
