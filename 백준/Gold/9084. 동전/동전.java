import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) arr[j] = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(br.readLine());
            int[] dp = new int[m + 1];
            dp[0] = 1;
            for (int j = 0; j < n; j++) {
                for (int k = arr[j]; k <= m; k++) {
                    dp[k] = dp[k] + dp[k - arr[j]];
                }
            }
            System.out.println(dp[m]);
        }
    }
}
