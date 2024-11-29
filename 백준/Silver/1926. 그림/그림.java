import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[][] map;
    static int max;
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;

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
        isVisited[x][y] = true;
        queue.offer(new point(x, y));
        int cnt = 1;
        while (!queue.isEmpty()) {
            point t = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = t.x + dx[i];
                int ny = t.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                        queue.offer(new point(nx, ny));
                        isVisited[nx][ny] = true;
                        cnt++;
                    }
                    else {
                        max = Math.max(max, cnt);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        isVisited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isVisited[i][j] && map[i][j] == 1) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}
