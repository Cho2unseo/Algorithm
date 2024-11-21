import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) return;
            int cnt = 2;
            while (n > 0) {
                if (n % 10 == 1) cnt += 2;
                else if (n % 10 == 0) cnt += 4;
                else cnt += 3;
                cnt++;
                n /= 10;
            }
            System.out.println(cnt - 1);
        }
    }
}
