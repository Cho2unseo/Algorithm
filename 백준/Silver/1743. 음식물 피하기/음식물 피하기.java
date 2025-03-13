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
    static int k;
    static int[][] arr;
    static boolean[][] isVisited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static int max;

    static int bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        int cnt = 1;
        isVisited[x][y] = true;
        queue.offer(new Point(x, y));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int px = p.x + dx[i];
                int py = p.y + dy[i];
                if (px < 0 || py < 0 || px >= n || py >= m) continue;
                if (!isVisited[px][py] && arr[px][py] == 1) {
                    isVisited[px][py] = true;
                    queue.offer(new Point(px, py));
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        isVisited = new boolean[n][m];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[r - 1][c - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isVisited[i][j] && arr[i][j] == 1) {
                    int a = bfs(i, j);
                    max = Math.max(a, max);
                }
            }
        }
        System.out.println(max);
    }
}
