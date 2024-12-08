import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while (true) {
            int flag = 0;
            int res = 1;
            while (n > 0) {
                res *= n % 10;
                n = n / 10;
                flag++;
            }
            if (flag <= 1) break;
            cnt++;
            n = res;
        }
        System.out.println(cnt);
    }
}
