import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] l = new int[n + 1];
        int[] j = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) l[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) j[i] = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n + 1][100];
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < 100; k++) {
                if (l[i] <= k) dp[i][k] = Math.max(dp[i - 1][k], dp[i - 1][k - l[i]] + j[i]);
                else dp[i][k] = dp[i - 1][k];
            }
        }
        System.out.println(dp[n][99]);
    }
}