import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sa, sb;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        sa = a * 6 + b * 3 + c * 2 + d + e * 2;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        sb = a * 6 + b * 3 + c * 2 + d + e * 2;
        System.out.println(sa + " " + sb);
    }
}
