import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ts = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) ts[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int tt = 0;
        for (int i = 0; i < 6; i++) {
            if (ts[i] % t == 0) tt += ts[i] / t;
            else tt += ts[i] / t + 1;
        }
        System.out.println(tt);
        System.out.println((n / p) + " " + (n % p));
    }
}
