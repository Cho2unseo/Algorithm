import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        
        int u = 0, d = 0, r = 0, l = 0, tmp = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'U') u++;
                else if (s.charAt(j) == 'D') d--;
                else if (s.charAt(j) == 'R') r++;
                else if (s.charAt(j) == 'L') l--;
                if ((Math.abs(u) == Math.abs(d)) && (Math.abs(r) == Math.abs(l))) {
                    System.out.println("YES");
                    return;
                } else if (u + d == 0 && r + l == 0) {
                    System.out.println("YES");
                    return;
                }
                tmp++;
            }
            if (tmp > 5000000) break;
        }
        System.out.println("NO");
    }
}
