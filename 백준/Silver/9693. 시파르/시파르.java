import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int sum = 0;
            while (n > 0) {
                sum += n / 5;
                n /= 5;
            }
            System.out.println("Case #" + t++ + ": " + sum);
        }
    }
}