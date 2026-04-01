import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) break;
            int[] start = new int[n];
            int[] end = new int[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int src = Integer.parseInt(st.nextToken());
                int dest = Integer.parseInt(st.nextToken());
                int start_time = Integer.parseInt(st.nextToken());
                int dur = Integer.parseInt(st.nextToken());
                start[i] = start_time;
                end[i] = start_time + dur;
            }
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (start[j] < s + d && end[j] > s) cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
}
