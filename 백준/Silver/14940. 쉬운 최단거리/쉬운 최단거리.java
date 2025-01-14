import java.awt.*;
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
    static int[][] ans;
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        isVisited[x][y] = true;
        queue.offer(new Point(x, y));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                        ans[nx][ny] = ans[p.x][p.y] + 1;
                        isVisited[nx][ny] = true;
                        queue.offer(new Point(nx, ny));
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
        map = new int[n + 1][m + 1];
        ans = new int[n + 1][m + 1];
        isVisited = new boolean[n + 1][m + 1];
        int endx = 0;
        int endy = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    endx = i;
                    endy = j;
                }
                else if (map[i][j] == 0) {
                    ans[i][j] = -2;
                }
            }
        }
        bfs(endx, endy);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isVisited[i][j]) {
                    if (ans[i][j] == -2) System.out.print(0 + " ");
                    else System.out.print(-1 + " ");
                }
                else System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
