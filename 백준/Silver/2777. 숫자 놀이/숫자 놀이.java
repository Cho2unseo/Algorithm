import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            if (n < 10) {
                System.out.println(1);
                continue;
            }
            for (int j = 9; j >= 2; j--) {
                while (n % j == 0) {
                    cnt++;
                    n = n / j;
                }
                if (n == 1) break;
            }
            if (n != 1) System.out.println(-1);
            else System.out.println(cnt);
        }
    }
}
