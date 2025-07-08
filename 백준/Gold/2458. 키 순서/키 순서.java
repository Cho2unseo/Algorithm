import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) Arrays.fill(map[i], 0);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
        }
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][k] == 1 && map[k][j] == 1) {
                        map[i][j] = 1;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                if (map[i][j] == 0 && map[j][i] == 0) {
                    flag = 0;
                    break;
                }
                else flag = 1;
            }
            if (flag == 1) ans++;
        }
        System.out.println(ans);
    }
}
