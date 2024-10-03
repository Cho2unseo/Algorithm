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
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int tot = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            tot += tmp;
            if (tot < 0) tot = 0;
            if (tot >= m) cnt++;
        }
        System.out.println(cnt);
    }
}
