import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int count;

        Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

        @Override
        public int compareTo(Point o) {
            return this.count - o.count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        char[][] map = new char[n + 1][m + 1];
        boolean[][] isVisited = new boolean[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= m; j++) {
                map[i][j] = s.charAt(j - 1);
            }
        }
        Queue<Point> queue = new PriorityQueue<>();
        queue.offer(new Point(1, 1, 0));
        isVisited[1][1] = true;
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            if (cur.x == n && cur.y == m) {
                System.out.println(cur.count);
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx < 1 || ny < 1 || nx > n || ny > m) continue;
                if (!isVisited[nx][ny]) {
                    if (map[nx][ny] == '1') queue.offer(new Point(nx, ny, cur.count + 1));
                    else queue.offer(new Point(nx, ny, cur.count));
                    isVisited[nx][ny] = true;
                }
            }
        }
    }
}
