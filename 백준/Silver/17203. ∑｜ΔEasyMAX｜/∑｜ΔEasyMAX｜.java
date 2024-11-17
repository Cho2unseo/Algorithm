import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] dp = new int[n + 1];
        dp[0] = arr[0];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) dp[i] = arr[i] - arr[i - 1];
        for (int i = 0; i < q; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            if (s == e) System.out.println(0);
            else {
                for (int j = s; j < e; j++) sum += Math.abs(dp[j]);
                System.out.println(sum);
            }
        }
    }
}
