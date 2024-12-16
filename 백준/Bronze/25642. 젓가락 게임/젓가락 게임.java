import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (true) {
            b += a;
            if (b >= 5) {
                System.out.println("yt");
                break;
            }
            a += b;
            if (a >= 5) {
                System.out.println("yj");
                break;
            }
        }
    }
}
