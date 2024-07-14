import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static BigInteger Factorial(int n) {
        if (n <= 0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(Factorial(n - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        BigInteger cnt;
        n = sc.nextInt();
        if (n < 5) return;
        else {
            cnt = Factorial(n).divide(Factorial(n - 5).multiply(Factorial(5)));
            System.out.println(cnt);
        }
    }
}
