import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int min = 0;
            int max = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                int tmp = Math.min(num, l - num);
                min = Math.max(tmp, min);
                max = Math.max(max, num);
                max = Math.max(max, l - num);
            }
            System.out.println(min + " " + max);
        }
    }
}
