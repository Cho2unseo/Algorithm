import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int max = 1;
        for (int i = 1; i <= n; i++) {
            int[] dp = new int[n + 1];
            for (int j = 1; j <= n; j++) dp[j] = 1;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    if (j < i) {
                        if (arr[j] > arr[k]) dp[j] = Math.max(dp[j], dp[k] + 1);
                    }
                    else {
                        if (arr[j] < arr[k]) dp[j] = Math.max(dp[j], dp[k] + 1);
                    }
                }
                max = Math.max(max, dp[j]);
            }
        }
        System.out.println(max);
    }
}
