import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    static int m;
    static int max;

    static void wall(int cnt) {
        if (cnt == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    wall(cnt + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) queue.offer(new Point(i, j));
            }
        }
        int[][] newarr = new int[n][m];
        for (int i = 0; i < n; i++) newarr[i] = arr[i].clone();
        int cnt = 0;
        while (!queue.isEmpty()) {
            Point np = queue.poll();
            int px = np.x;
            int py = np.y;
            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (nx >= n || ny >= m || nx < 0 || ny < 0) continue;
                if (newarr[nx][ny] == 0) {
                    newarr[nx][ny] = 2;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (newarr[i][j] == 0) cnt++;
            }
        }
        max = Math.max(max, cnt);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        wall(0);
        System.out.println(max);
    }
}
