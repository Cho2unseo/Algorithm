import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int m = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[m];
            int[] b = new int[m];
            for (int j = 0; j < m; j++) a[j] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) b[j] = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if (b[k] - a[j] == 1000) cnt++;
                }
            }
            System.out.println(cnt / 2);
        }
    }
}
