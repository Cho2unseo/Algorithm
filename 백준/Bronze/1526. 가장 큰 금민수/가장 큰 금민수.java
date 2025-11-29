import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 4; i--) {
            int a = i;
            while (a > 0) {
                if (a % 10 != 4 && a % 10 != 7) break;
                a /= 10;
            }
            if (a == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
