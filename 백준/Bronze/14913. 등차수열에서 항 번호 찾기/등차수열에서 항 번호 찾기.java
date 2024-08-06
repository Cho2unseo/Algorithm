import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (d > 0) {
            for (int i = 0; a <= k; i++) {
                if (a == k) {
                    System.out.println(i + 1);
                    return;
                }
                a = a + d;
            }
        }
        else {
            for (int i = 0; a >= k; i++) {
                if (a == k) {
                    System.out.println(i + 1);
                    return;
                }
                a = a + d;
            }
        }
        System.out.println("X");
    }
}
