import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] h = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }
        double sum = 0;
        for (int i = 1; i < n; i++) {
            int df = h[i] - h[i - 1];
            int hp = h[i] + h[i - 1];
            sum = sum + Math.pow(df, 2) + Math.pow(hp, 2);
        }
        System.out.println((int)sum);
    }
}
