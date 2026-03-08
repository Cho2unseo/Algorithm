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
            while (n > 1) {
                if (n % 2 == 1) {
                    cnt++;
                    n++;
                }
                n /= 2;
            }
            System.out.println(cnt);
        }
    }
}
