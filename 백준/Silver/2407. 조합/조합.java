import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BigDecimal[][] arr = new BigDecimal[n + 1][n  + 1];
        for (int i = 0; i <= n; i++) {
            arr[i][0] = BigDecimal.ONE;
            arr[i][1] = BigDecimal.valueOf(i);
            arr[i][i] = BigDecimal.ONE;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) arr[i][j] = arr[i - 1][j].add(arr[i - 1][j - 1]);
        }
        System.out.println(arr[n][m]);
    }
}
