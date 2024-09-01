import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        while (n > 1) {
            if (n % 2 == 1) {
                System.out.println(0);
                return;
            }
            n = n / 2;
        }
        System.out.println(1);
    }
}
