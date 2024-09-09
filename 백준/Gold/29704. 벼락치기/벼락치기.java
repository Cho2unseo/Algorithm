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
        int t = Integer.parseInt(st.nextToken());
        int[] d = new int[1001];
        int[] m = new int[1001];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            d[i] = Integer.parseInt(st.nextToken());
            m[i] = Integer.parseInt(st.nextToken());
        }
        int dsum = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            dsum += d[i];
            sum += m[i];
        }
        if (dsum <= t) {
            System.out.println(0);
            return;
        }
        int[][] dp = new int[1001][1001];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= t; j++) {
                if (j - d[i] >= 0) dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - d[i]] + m[i]);
                else dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(sum - dp[n][t]);
    }
}
