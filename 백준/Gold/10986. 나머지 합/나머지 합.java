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
        long[] a = new long[n];
        long[] arr = new long[m];
        long cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if (i == 0) a[0] = Long.parseLong(st.nextToken());
            else a[i] = a[i - 1] + Long.parseLong(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            int tmp = (int) (a[i] % m);
            if (tmp == 0) cnt++;
            arr[tmp]++;
        }
        for (int i = 0; i < m; i++) {
            if (arr[i] > 1) cnt += (arr[i] * (arr[i] - 1)) / 2;
        }
        System.out.println(cnt);
    }
}
