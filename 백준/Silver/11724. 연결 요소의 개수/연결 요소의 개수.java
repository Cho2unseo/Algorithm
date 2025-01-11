import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int n;
    static int m;
    static boolean[] isVisited;
    static int cnt;

    static void dfs(int start) {
        isVisited[start] = true;
        for (int i = 1; i <= n; i++) {
            if (!isVisited[i] && map[start][i] == 1) dfs(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];
        isVisited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u][v] = 1;
            map[v][u] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if (!isVisited[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
