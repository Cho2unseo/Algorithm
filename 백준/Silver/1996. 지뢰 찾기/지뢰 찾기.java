import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        char[][] zi = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map[i] = s.toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != '.') zi[i][j] = '*';
                else {
                    int cnt = 0;
                    if (i - 1 >= 0 && j - 1 >= 0 && map[i - 1][j - 1] != '.') cnt += map[i - 1][j - 1] - '0';
                    if (i - 1 >= 0 && map[i - 1][j] != '.') cnt += map[i - 1][j] - '0';
                    if (i - 1 >= 0 && j + 1 < n && map[i - 1][j + 1] != '.') cnt += map[i - 1][j + 1] - '0';
                    if (j - 1 >= 0 && map[i][j - 1] != '.') cnt += map[i][j - 1] - '0';
                    if (j + 1 < n && map[i][j + 1] != '.') cnt += map[i][j + 1] - '0';
                    if (i + 1 < n && j - 1 >= 0 && map[i + 1][j - 1] != '.') cnt += map[i + 1][j - 1] - '0';
                    if (i + 1 < n && map[i + 1][j] != '.') cnt += map[i + 1][j] - '0';
                    if (i + 1 < n && j + 1 < n && map[i + 1][j + 1] != '.') cnt += map[i + 1][j + 1] - '0';
                    if (cnt >= 10) zi[i][j] = 'M';
                    else zi[i][j] = (char) (cnt + '0');
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0;j < n; j++) {
                System.out.print(zi[i][j]);
            }
            System.out.println();
        }
    }
}
