import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        if ((a * k + b) == (c * k + d)) {
            long fk = a * k + b;
            System.out.println("Yes " + fk);
            return;
        }
        System.out.println("No");
    }
}
