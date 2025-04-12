import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (r == 0 && c == 0) break;
            char[][] map = new char[r][c];
            char[][] ans = new char[r][c];
            for (int i = 0; i < r; i++) {
                String s = br.readLine();
                map[i] = s.toCharArray();
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (map[i][j] == '.') {
                        int cnt = 0;
                        if (i - 1 >= 0) {
                            if (map[i - 1][j] == '*') cnt++;
                            if (j - 1 >= 0) {
                                if (map[i - 1][j - 1] == '*') cnt++;
                            }
                            if (j + 1 < c) {
                                if (map[i - 1][j + 1] == '*') cnt++;
                            }
                        }
                        if (i + 1 < r) {
                            if (map[i + 1][j] == '*') cnt++;
                            if (j - 1 >= 0) {
                                if (map[i + 1][j - 1] == '*') cnt++;
                            }
                            if (j + 1 < c) {
                                if (map[i + 1][j + 1] == '*') cnt++;
                            }
                        }
                        if (j - 1 >= 0) {
                            if (map[i][j - 1] == '*') cnt++;
                        }
                        if (j + 1 < c) {
                            if (map[i][j + 1] == '*') cnt++;
                        }
                        ans[i][j] = (char) (cnt + '0');
                    }
                    else ans[i][j] = '*';
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }
    }
}
