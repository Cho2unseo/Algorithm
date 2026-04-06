import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int lena = a.length();
        int lenb = b.length();
        int[][] dp = new int[lena + 1][lenb + 1];
        for (int i = 1; i <= lena; i++) {
            for (int j = 1; j <= lenb; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        System.out.println(dp[lena][lenb]);
        Stack<Character> stack = new Stack<>();
        while (true) {
            if (dp[lena][lenb] == 0) break;
            if (dp[lena][lenb] == dp[lena - 1][lenb]) lena--;
            else if (dp[lena][lenb] == dp[lena][lenb - 1]) lenb--;
            else {
                stack.push(a.charAt(lena - 1));
                lena--;
                lenb--;
            }
        }
        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
}
