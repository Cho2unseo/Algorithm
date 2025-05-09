import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int r1;
    static int c1;
    static int r2;
    static int c2;
    static int[][] map;
    static int[] dx = {-2, -2, 0, 0, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -1, 1};
    static boolean[][] isVisited;

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y, 1});
        isVisited[x][y] = true;
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            int px = p[0];
            int py = p[1];
            int dist = p[2];
            if (px == r2 && py == c2) return dist;
            for (int i = 0; i < 6; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (nx >= n || ny >= n || nx < 0 || ny < 0) continue;
                if (nx == r2 && ny == c2) return dist;
                if (!isVisited[nx][ny]) {
                    queue.offer(new int[] {nx, ny, dist + 1});
                    isVisited[nx][ny] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        isVisited = new boolean[n][n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        r1 = Integer.parseInt(st.nextToken());
        c1 = Integer.parseInt(st.nextToken());
        r2 = Integer.parseInt(st.nextToken());
        c2 = Integer.parseInt(st.nextToken());
        System.out.println(bfs(r1, c1));
    }
}
