import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        while (a != k) {
            if (k % 2 == 0 && k / 2 >= a) k /= 2;
            else k--;
            cnt++;
        }
        System.out.println(cnt);
    }
}
