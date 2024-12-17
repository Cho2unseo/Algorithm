import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean check(int n) {
        int[] arr = new int[10];
        while (n > 0) {
            if (arr[n % 10] > 0) return false;
            arr[n % 10]++;
            n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i = n; i <= m; i++) {
                if (check(i)) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
