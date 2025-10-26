import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) b[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                int cnt = 0;
                while (cnt < 3) {
                    if (i + cnt > n - 1) break;
                    a[i + cnt] *= -1;
                    cnt++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (b[i] > 0) {
                int cnt = 0;
                while (cnt < 3) {
                    if (i + cnt > n - 1) break;
                    b[i + cnt] *= -1;
                    cnt++;
                }
            }
        }
        int suma = 0;
        int sumb = 0;
        for (int i = 0; i < n; i++) {
            suma += a[i];
            sumb += b[i];
        }
        System.out.println(suma - sumb);
    }
}
