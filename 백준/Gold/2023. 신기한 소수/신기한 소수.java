import java.util.Scanner;

public class Main {

    static int n;

    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void recursive(int depth, int num) {
        if (depth == n) {
            if (isPrime(num)) System.out.println(num);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                int tmp = num * 10 + i;
                if (isPrime(tmp)) recursive(depth + 1, tmp);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        recursive(1, 2);
        recursive(1, 3);
        recursive(1, 5);
        recursive(1, 7);
    }
}
