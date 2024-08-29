import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            int loc = i - 1;
            int newItem = a[i];
            while (0 <= loc && newItem < a[loc]) {
                a[loc + 1] = a[loc];
                loc--;
                cnt++;
                if (cnt == k) {
                    for (int j = 0; j < n; j++) System.out.print(a[j] + " ");
                    return;
                }
            }
            if (loc + 1 != i) {
                a[loc + 1] = newItem;
                cnt++;
            }
        }
        System.out.println("-1");
    }
}
