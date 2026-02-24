import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int res = 0;
        int mina = 1000;
        int minb = 1000;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            mina = Math.min(mina, Integer.parseInt(st.nextToken()));
            minb = Math.min(minb, Integer.parseInt(st.nextToken()));
        }
        if (mina < minb * 6) {
            res += (n / 6) * mina;
            res += Math.min(n % 6 * minb, mina);
        }
        else res = minb * n;
        System.out.println(res);
    }
}
