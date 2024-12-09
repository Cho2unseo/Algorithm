import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) return x;
        return find(parent[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x < y) parent[y] = x;
        else if (x > y) parent[x] = y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        parent = new int[n + 1];
        boolean[] know = new boolean[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;
        int tr = Integer.parseInt(st.nextToken());
        for (int i = 0; i < tr; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            know[tmp] = true;
        }
        int cnt = 0;
        int[][] p = new int[m][];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int pt = Integer.parseInt(st.nextToken());
            p[i] = new int[pt];
            p[i][0] = Integer.parseInt(st.nextToken());
            for (int j = 1; j < pt; j++) {
                p[i][j] = Integer.parseInt(st.nextToken());
                union(p[i][0], p[i][j]);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (know[i]) {
                for (int j = 1; j <= n; j++) {
                    if (find(i) == find(j)) know[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            int flag = 0;
            for (int j = 0; j < p[i].length; j++) {
                if (know[find(p[i][j])]) flag++;
            }
            if (flag == 0) cnt++;
        }
        System.out.println(cnt);
    }
}
