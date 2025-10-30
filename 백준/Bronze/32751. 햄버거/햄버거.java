import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        if (s.charAt(0) != 'a' || s.charAt(n - 1) != 'a') {
            System.out.println("No");
            return;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                System.out.println("No");
                return;
            }
            switch (s.charAt(i)) {
                case 'a': a--; break;
                case 'b': b--; break;
                case 'c': c--; break;
                default: d--;
            }
        }
        if (a < 0 || b < 0 || c < 0 || d < 0) System.out.println("No");
        else System.out.println("Yes");
    }
}
