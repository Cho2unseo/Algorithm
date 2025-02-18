import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[1000001];
        for (int i = 2; i <= 1000; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j < 1000000; j += i) arr[j] = true;
            }
        }
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n / 2; j++) {
                if (!arr[j] && !arr[n - j]) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
