import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] t = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            t[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(t);
        long res = 0, max = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                res = t[i] + t[n - 1 - i];
                if (res > max) max = res;
            }
        }
        else {
            if (n == 1) max = t[0];
            else {
                for (int i = 0; i < n / 2; i++) {
                    res = t[i] + t[n - 2 - i];
                    if (res > max) max = res;
                }
                if (t[n - 1] > max) max = t[n - 1];
            }
        }
        System.out.println(max);
    }
}
