import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) p[a[i] - 1] = i + 1;
        // for (int i = 0; i < n; i++) System.out.print(p[i]);
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            int[] b = p.clone();
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            Arrays.sort(b, l - 1, r);
            // for (int j = 0; j < n; j++) System.out.print(b[j]);
            int[] ans = new int[n];
            for (int j = 0; j < n; j++) ans[b[j] - 1] = j + 1;
            for (int j = 0; j < n; j++) System.out.print(ans[j] + " ");
            System.out.println();
        }
    }
}
