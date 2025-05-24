import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int k;
    static int[][] map;
    static boolean[][][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class State {
        int x;
        int y;
        int dist;
        int destroyed;
        State(int x, int y, int dist, int destroyed) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.destroyed = destroyed;
        }
    }

    static int bfs() {
        Queue<State> queue = new ArrayDeque<>();
        queue.offer(new State(0, 0, 1, 0));
        isVisited[0][0][0] = true;
        while (!queue.isEmpty()) {
            State cur = queue.poll();
            if (cur.x == n - 1 && cur.y == m - 1) return cur.dist;
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (!isVisited[nx][ny][cur.destroyed]) {
                    if (map[nx][ny] == 0) {
                        queue.offer(new State(nx, ny, cur.dist + 1, cur.destroyed));
                        isVisited[nx][ny][cur.destroyed] = true;
                    }
                    else {
                        if (cur.destroyed < k) {
                            queue.offer(new State(nx, ny, cur.dist + 1, cur.destroyed + 1));
                            isVisited[nx][ny][cur.destroyed] = true;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        isVisited = new boolean[n][m][k + 1];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        System.out.println(bfs());
    }
}
