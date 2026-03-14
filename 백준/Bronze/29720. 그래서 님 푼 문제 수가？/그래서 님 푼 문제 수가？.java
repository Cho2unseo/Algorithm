import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int mul = m * k;
        int a = Math.max(0, n - mul);
        int b = Math.max(0, n - mul + m - 1);
        System.out.println(a + " " + b);
    }
}
