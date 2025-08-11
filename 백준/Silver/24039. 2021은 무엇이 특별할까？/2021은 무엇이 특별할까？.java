import java.util.Scanner;

public class Main {

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                for (int j = i + 1; j < 10000; j++) {
                    if (isPrime(j)) {
                        if (i * j > n) {
                            System.out.println(i * j);
                            return;
                        }
                        else break;
                    }
                }
            }
        }
    }
}
