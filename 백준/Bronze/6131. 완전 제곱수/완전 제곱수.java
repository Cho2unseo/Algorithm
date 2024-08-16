import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int a, b;
        for (int i = 1; i <= 500; i++) {
            b = i;
            a = (int) Math.sqrt(Math.pow(b, 2) + n);
            if (Math.pow(a, 2) == Math.pow(b, 2) + n) cnt++;
        }
        System.out.println(cnt);
    }
}
