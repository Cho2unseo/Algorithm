import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        long[] dp = new long[n + 1];
        st = new StringTokenizer(br.readLine());
        long max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
        dp[0] = 0;
        for (int i = 1; i <= n; i++) dp[i] = dp[i - 1] + arr[i];
        for (int i = k; i <= n; i++) max = Math.max(max, dp[i] - dp[i - k]);


        System.out.println(max);
    }
}
