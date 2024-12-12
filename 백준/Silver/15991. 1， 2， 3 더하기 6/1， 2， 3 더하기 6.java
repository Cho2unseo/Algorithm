import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] dp = new long[100001];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 2;
            dp[4] = 3;
            dp[5] = 3;
            dp[6] = 6;
            for (int j = 7; j <= n; j++) {
                dp[j] = (dp[j - 2] + dp[j - 4] + dp[j - 6]) % 1000000009;
            }
            long ans = dp[n] % 1000000009;
            bw.write(ans + "\n");
        }
        bw.flush();
        bw.close();
    }
}
