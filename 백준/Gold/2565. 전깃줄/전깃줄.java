import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[501];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a] = b;
        }
        int[] dp = new int[501];
        for (int i = 1; i < 501; i++) dp[i] = 1;
        int max = 1;
        for (int i = 1; i < 501; i++) {
            for (int j = 1; j <= i; j++) {
                if (arr[i] > arr[j] && arr[i] > 0 && arr[j] > 0) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(dp[i], max);
        }
        System.out.println(n - max);
    }
}
