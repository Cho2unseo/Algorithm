import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] coor = new int[n + 1][2];
        for (int j = 1; j <= n; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coor[j][0] = Integer.parseInt(st.nextToken());
            coor[j][1] = Integer.parseInt(st.nextToken());
        }
        int[][] map = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = 301;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if ((coor[j][0] >= coor[i][0] && coor[i][1] >= coor[j][0]) || (coor[j][1] <= coor[i][1] && coor[j][1] >= coor[i][0]) || (coor[j][0] < coor[i][0] && coor[j][1] > coor[i][1])) {
                    map[i][j] = 1;
                    map[j][i] = 1;
                }
            }
        }
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    map[i][j] = Math.min(map[i][k] + map[k][j], map[i][j]);
                }
            }
        }
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (map[a][b] == 301) System.out.println(-1);
            else System.out.println(map[a][b]);
        }
    }
}
