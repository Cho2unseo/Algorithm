import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("int a;");
        System.out.println("int *ptr = &a;");
        if (n == 1) return;
        for (int i = 2; i <= n; i++) {
            System.out.print("int ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.print("ptr" + i + " = &ptr");
            if (i > 2) System.out.println((i - 1) + ";");
            else System.out.println(";");
        }
    }
}
