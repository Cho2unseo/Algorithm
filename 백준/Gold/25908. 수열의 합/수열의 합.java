import java.util.Scanner;

public class Main {

    public static int an(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) a += n / i;
            else a -= n / i;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int sum = an(t) - an(s - 1);
        System.out.println(sum);
    }
}
