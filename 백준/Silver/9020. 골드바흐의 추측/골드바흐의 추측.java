import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[10001];
        for (int i = 2; i <= 100; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j < 10000; j += i) arr[j] = true;
            }
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = n / 2; j >= 2; j--) {
                if (!arr[j] && !arr[n - j]) {
                    System.out.println(j + " " + (n - j));
                    break;
                }
            }
        }
    }
}
