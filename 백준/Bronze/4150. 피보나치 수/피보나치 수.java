import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] arr = new BigInteger[n + 1];
        arr[1] = BigInteger.valueOf(1);
        if (n >= 2) {
            arr[2] = BigInteger.valueOf(1);
            for (int i = 3; i <= n; i++) arr[i] = arr[i - 1].add(arr[i - 2]);
        }
        System.out.println(arr[n]);
    }
}
