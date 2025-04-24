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
        Arrays.sort(a);
        int s = 0;
        int p = 0;
        for (int i = 0; i < n / 2; i++) {
            s += a[i];
            p += a[n - i - 1];
        }
        if (n % 2 == 1) p += a[n / 2];
        System.out.println(s + " " + p);
    }
}