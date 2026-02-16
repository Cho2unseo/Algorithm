import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        int start = 1;
        int end = m;
        int cnt = 0;
        for (int i = 0; i < j; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a > end) {
                start = start + (a - end);
                cnt += a - end;
                end = a;
            }
            else if (a < start) {
                cnt += start - a;
                end = end - (start - a);
                start = a;
            }
        }
        System.out.println(cnt);
    }
}
