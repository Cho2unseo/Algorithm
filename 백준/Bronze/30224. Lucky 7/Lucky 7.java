import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if (n % 7 == 0) {
            while (n > 0) {
                if (n % 10 == 7) flag = 1;
                n /= 10;
            }
            if (flag == 1) System.out.println(3);
            else System.out.println(1);
        }
        else {
            while (n > 0) {
                if (n % 10 == 7) flag = 1;
                n /= 10;
            }
            if (flag == 1) System.out.println(2);
            else System.out.println(0);
        }

    }
}
