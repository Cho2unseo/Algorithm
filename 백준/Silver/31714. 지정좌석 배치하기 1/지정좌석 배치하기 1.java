import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int flag = 0;
        int[][] h = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                h[i][j] = Integer.parseInt(st.nextToken()) + (d * i);
            }
        }
        for (int i = 0; i < n; i++) Arrays.sort(h[i]);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (h[i][j] >= h[i + 1][j]) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) System.out.println("YES");
        else System.out.println("NO");

        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(h[i][j] + " ");
            }
            System.out.println();
        }

         */

    }
}
