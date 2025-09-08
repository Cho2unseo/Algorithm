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
            boolean[] arr = new boolean[n + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (k % j == 0) arr[k] = !arr[k];
                }
            }
            for (int j = 1; j <= n; j++) {
                if (arr[j]) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
