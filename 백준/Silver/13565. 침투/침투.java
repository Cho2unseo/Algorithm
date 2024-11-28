import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int m;
    static int n;
    static int[][] map;
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class point {
        int x;
        int y;
        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(int x, int y) {
        Queue<point> queue = new LinkedList<>();
        queue.offer(new point(x, y));
        isVisited[x][y] = true;
        while (!queue.isEmpty()) {
            point tmp = queue.poll();
            int tx = tmp.x;
            int ty = tmp.y;
            for (int i = 0; i < 4; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (!isVisited[nx][ny] && map[nx][ny] == 0) {
                        queue.offer(new point(nx, ny));
                        isVisited[nx][ny] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        char[][] tmp = new char[m][n];
        map = new int[m][n];
        isVisited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            tmp[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) map[i][j] = tmp[i][j] - '0';
        }
        for (int i = 0; i < n; i++) {
            if (map[0][i] == 0) {
                bfs(0, i);
                isVisited[0][i] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (isVisited[m - 1][i]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
