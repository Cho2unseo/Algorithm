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
        for (int i = 0; i < n; i++) h[i] = Integer.parseInt(st.nextToken());
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (h[i - 1] <= h[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
