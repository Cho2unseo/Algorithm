import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] a = new String[n];
            String[] b = new String[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) a[j] = st.nextToken();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) b[j] = st.nextToken();
            Arrays.sort(a);
            Arrays.sort(b);
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (!a[j].equals(b[j])) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println("NOT CHEATER");
            else System.out.println("CHEATER");
        }
    }
}
