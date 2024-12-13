import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int x;
    static int y;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] isVisited;
    static int max;

    static class point {
        int xx;
        int yy;

        public point(int xx, int yy) {
            this.xx = xx;
            this.yy = yy;
        }
    }

    static void bfs(int startx, int starty) {
        Queue<point> queue = new LinkedList<>();
        isVisited[startx][starty] = true;
        queue.offer(new point(startx, starty));
        int[][] distance = new int[x][y];
        distance[startx][starty] = 0;
        while (!queue.isEmpty()) {
            point pq = queue.poll();
            int nx = pq.xx;
            int ny = pq.yy;
            for (int i = 0; i < 4; i++) {
                int px = nx + dx[i];
                int py = ny + dy[i];
                if (px >= 0 && px < x && py >= 0 && py < y) {
                    if (!isVisited[px][py] && map[px][py] == 'L') {
                        queue.offer(new point(px, py));
                        isVisited[px][py] = true;
                        distance[px][py] = distance[nx][ny] + 1;
                        max = Math.max(max, distance[px][py]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        map = new char[x][y];
        isVisited = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            map[i] = br.readLine().toCharArray();
        }
        /*
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) System.out.print(map[i][j]);
            System.out.println();
        }
         */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                isVisited = new boolean[x][y];
                if (!isVisited[i][j] && map[i][j] == 'L') bfs(i, j);
            }
        }
        System.out.println(max);
    }
}
