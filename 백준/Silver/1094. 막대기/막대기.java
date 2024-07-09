import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 64;
        int cnt = 0;
        while (x > 0) {
            if (sum > x) sum = sum / 2;
            else {
                x = x - sum;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
