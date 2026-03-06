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
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                if (a[start] + a[end] == a[i]) {
                    if (start != i && end != i) {
                        cnt++;
                        break;
                    }
                    else if (start == i) start++;
                    else if (end == i) end--;
                }
                else if (a[start] + a[end] < a[i]) start++;
                else end--;
            }
        }
        System.out.println(cnt);
    }
}
