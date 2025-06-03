import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int total = 0;
            int max = 0;
            int idx = 0;
            int flag = 0;
            int n = Integer.parseInt(br.readLine());
            for (int j = 1; j <= n; j++) {
                int a = Integer.parseInt(br.readLine());
                total += a;
                if (a > max) {
                    max = a;
                    idx = j;
                    flag = 0;
                }
                else if (a == max) flag = 1;
            }
            if (flag == 0) {
                if (max > total / 2) System.out.println("majority winner " + idx);
                else System.out.println("minority winner " + idx);
            }
            else System.out.println("no winner");
        }
    }
}
