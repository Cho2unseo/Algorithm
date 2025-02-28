import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int m;
        if (b % d == 0) m = b / d;
        else m = b / d + 1;
        int k;
        if (a % c == 0) k = a / c;
        else k = a / c + 1;
        System.out.println(l - Math.max(m, k));
    }
}
