import java.util.Scanner;

public class Main {

    static long func(int a) {
        long res = 1;
        for (int i = a; i >= 1; i--) res *= i;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long res = func(n) / (func(a) * func(b) * func(c));
        System.out.println(res);
    }
}