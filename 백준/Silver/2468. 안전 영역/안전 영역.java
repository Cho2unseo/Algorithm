import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] arr;
    static boolean[][] isVisited;
    static int height;
    static int min = Integer.MAX_VALUE;
    static int cnt = 1;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void bfs(int x, int y, int h) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        isVisited[x][y] = true;
        while (!queue.isEmpty()) {
            Point np = queue.poll();
            int px = np.x;
            int py = np.y;
            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (!isVisited[nx][ny] && arr[nx][ny] > h) {
                    isVisited[nx][ny] = true;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                height = Math.max(height, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }
        for (int i = 0; i < height; i++) {
            int count = 0;
            isVisited = new boolean[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[j][k] > i && !isVisited[j][k]) {
                        bfs(j, k, i);
                        count++;
                    }
                }
            }
            cnt = Math.max(count, cnt);
        }
        System.out.println(cnt);
    }
}
