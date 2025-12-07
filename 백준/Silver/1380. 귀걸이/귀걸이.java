import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            String[] arr = new String[n + 1];
            for (int i = 1; i <= n; i++) arr[i] = br.readLine();
            int[] ck = new int[n + 1];
            for (int i = 0; i < 2 * n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                ck[a]++;
            }
            System.out.print(t++ + " ");
            for (int i = 1; i <= n; i++) {
                if (ck[i] < 2) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}