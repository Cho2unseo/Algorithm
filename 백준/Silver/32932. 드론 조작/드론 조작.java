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
        int garo = 500;
        int sero = 500;
        boolean[][] map = new boolean[1002][1002];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) + 500;
            int y = Integer.parseInt(st.nextToken()) + 500;
            map[y][x] = true;
        }
        String s = br.readLine();
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'U') {
                if (!map[sero + 1][garo]) sero++;
            }
            else if (s.charAt(i) == 'D') {
                if (!map[sero - 1][garo]) sero--;
            }
            else if (s.charAt(i) == 'R') {
                if (!map[sero][garo + 1]) garo++;
            }
            else if (s.charAt(i) == 'L') {
                if (!map[sero][garo - 1]) garo--;
            }
        }
        System.out.println((garo - 500) + " " + (sero - 500));
    }
}
