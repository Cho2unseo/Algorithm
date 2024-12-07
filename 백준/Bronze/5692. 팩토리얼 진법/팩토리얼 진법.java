import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) return;
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                int n = s.charAt(i) - '0';
                res += n * factorial(s.length() - i);
            }
            System.out.println(res);
        }
    }
}
