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
        int[][] dp = new int[n + 1][m];
        for (int i = 1; i <= n; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                for (int k = 0; k < m; k++) {
                    if (j == k) continue;
                    dp[i][j] = Math.min(dp[i - 1][k] + tmp, dp[i][j]);
                }

            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++)
            min = Math.min(dp[n][i], min);
        System.out.println(min);
    }
}
