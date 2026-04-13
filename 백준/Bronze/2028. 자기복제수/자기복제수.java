import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String tmp = String.valueOf(n);
            long num = (long) n * n;
            if (num % Math.pow(10, tmp.length()) == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
