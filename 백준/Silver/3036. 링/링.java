import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int tmp = sc.nextInt();
            for (int cnt = Math.min(tmp, f); cnt >= 1; cnt--) {
                if (tmp % cnt == 0 && f % cnt == 0) {
                    System.out.println(f / cnt + "/" + tmp / cnt);
                    break;
                }
            }
        }
    }
}
