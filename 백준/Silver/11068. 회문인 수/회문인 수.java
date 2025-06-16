import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int re(int n, int k) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            int digit = n % k;
            if (digit < 10) s.append((char) (digit + '0'));
            else s.append((char) (digit - 10 + 'A'));
            n /= k;
        }
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int flag = 0;
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= 64; j++) {
                if (re(n, j) == 1) {
                    System.out.println(1);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println(0);
        }
    }
}
