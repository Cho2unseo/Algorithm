import java.util.Scanner;

public class Main {

    static boolean func(int a) {
        for (int i = 1; i <= 100; i++) {
            if (i * i == a) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 0;
        for (int i = m; i <= n; i++) {
            if (func(i)) {
                if (min == 0) min = i;
                sum += i;
            }
        }
        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
