import java.util.Scanner;

public class Main {
    public static void number(int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) cnt += i;
        }
        if (cnt == n) System.out.println("Perfect");
        else if (cnt > n) System.out.println("Abundant");
        else System.out.println("Deficient");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            number(n);
        }
    }
}
