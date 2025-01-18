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
    static char[][] map;
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, - 1, 1};
    static int cnt;

    static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        isVisited[x][y] = true;
        queue.offer(new Point(x, y));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if ((nx < 0 || nx >= n || ny < 0 || ny >= m || map[nx][ny] == 'X') || isVisited[nx][ny]) continue;
                isVisited[nx][ny] = true;
                queue.offer(new Point(nx, ny));
                if (map[nx][ny] == 'P') cnt++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n + 1][m + 1];
        isVisited = new boolean[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map[i] = s.toCharArray();
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'I') {
                    x = i;
                    y = j;
                }
            }
        }
        bfs(x, y);
        if (cnt == 0) System.out.println("TT");
        else System.out.println(cnt);
    }
}
