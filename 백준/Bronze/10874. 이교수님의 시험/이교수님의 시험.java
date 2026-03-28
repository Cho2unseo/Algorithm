import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[11];
            int flag = 0;
            for (int j = 1; j <= 10;j ++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if (arr[j] % 5 != j % 5) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println(i);
        }
    }
}
