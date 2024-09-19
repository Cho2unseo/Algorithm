import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int xor = 0;
        long sum = 0;
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int com = Integer.parseInt(st.nextToken());
            if (com == 1) {
                int x = Integer.parseInt(st.nextToken());
                sum += x;
                xor ^= x;
            }
            else if (com == 2) {
                int x = Integer.parseInt(st.nextToken());
                xor ^= x;
                sum -= x;
            }
            else if (com == 3) {
                System.out.println(sum);
            }
            else if (com == 4) {
                System.out.println(xor);
            }
        }
    }
}
