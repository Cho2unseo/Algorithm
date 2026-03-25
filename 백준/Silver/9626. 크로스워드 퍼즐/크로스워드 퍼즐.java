import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        String[] arr = new String[m];
        for (int i = 0; i < m; i++) arr[i] = br.readLine();
        for (int i = 0; i < u; i++) {
            for (int j = 0; j < l + r + n; j++) {
                if ((i + j) % 2 == 0) System.out.print("#");
                else System.out.print(".");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                if ((i + j + u) % 2 == 0) System.out.print("#");
                else System.out.print(".");
            }
            System.out.print(arr[i]);
            for (int j = 0; j < r; j++) {
                if ((i + j + u + n + l) % 2 == 0) System.out.print("#");
                else System.out.print(".");
            }
            System.out.println();
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < l + r + n; j++) {
                if ((i + j + m + u) % 2 == 0) System.out.print("#");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
}
