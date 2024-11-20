import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] t = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) x[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) t[i] = Integer.parseInt(st.nextToken());
        int cnt = Math.max(t[n - 1], x[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            cnt += x[i + 1] - x[i];
            if (cnt < t[i]) cnt += t[i] - cnt;
        }
        cnt += x[0];
        System.out.println(cnt);
    }
}
