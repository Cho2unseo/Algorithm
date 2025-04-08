import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a == b) {
                System.out.println(cnt);
                return;
            }
            a = (a / 2) + (a % 2);
            b = (b / 2) + (b % 2);
            cnt++;
        }
        System.out.println(-1);
    }
}
