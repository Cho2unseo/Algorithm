import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] tn = new int[n + 2];
            for (int j = 1; j <= n + 1; j++) tn[j] = tn[j - 1] + j;
            int sum = 0;
            for (int j = 1; j <= n; j++) sum += j * tn[j + 1];
            System.out.println(sum);
        }
    }
}
