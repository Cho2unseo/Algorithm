import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n + 1];
        double[] dp = new double[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextDouble();
            dp[i] = Math.max(arr[i], dp[i - 1] * arr[i]);
        }
        double max = 0;
        for (int i = 1; i <= n; i++) max = Math.max(max, dp[i]);
        System.out.printf("%.3f", max);
    }
}
