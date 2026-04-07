import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int lena = a.length();
        int lenb = b.length();
        int lenc = c.length();
        int[][][] dp = new int[lena + 1][lenb + 1][lenc + 1];
        for (int i = 1; i <= lena; i++) {
            for (int j = 1; j <= lenb; j++) {
                for (int k = 1; k <= lenc; k++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1) && b.charAt(j - 1) == c.charAt(k - 1)) dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
                    else dp[i][j][k] = Math.max(dp[i - 1][j][k], Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                }
            }
        }
        System.out.println(dp[lena][lenb][lenc]);
    }
}
