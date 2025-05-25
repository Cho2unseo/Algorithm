import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int r;
    static int c;
    static char[][] map;
    static boolean[] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max;

    static void dfs(int x, int y, int cnt) {
        max = Math.max(max, cnt);
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < r && ny < c && nx >= 0 && ny >= 0) {
                if (!isVisited[map[nx][ny] - 'A']) {
                    isVisited[map[nx][ny] - 'A'] = true;
                    dfs(nx, ny, cnt + 1);
                    isVisited[map[nx][ny] - 'A'] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r + 1][c + 1];
        isVisited = new boolean[27];
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            map[i] = s.toCharArray();
        }
        isVisited[map[0][0] - 'A'] = true;
        dfs(0, 0, 1);
        System.out.println(max);
    }
}
