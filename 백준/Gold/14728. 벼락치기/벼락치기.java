import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] time = new int[n + 1];
        int[] score = new int[n + 1];
        int[][] dp = new int[n + 1][t + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            score[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= t; j++) {
                if (time[i] <= j) dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - time[i]] + score[i]);
                else dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[n][t]);
    }
}
