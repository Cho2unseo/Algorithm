import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static char[][] map;
    static int h;
    static int w;
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer;

    static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        isVisited[x][y] = true;
        queue.offer(new Point(x, y));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int px = p.x;
            int py = p.y;
            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (nx < 0 || ny < 0 || nx >= h || ny >= w || isVisited[nx][ny] || map[nx][ny] == '.') continue;
                queue.offer(new Point(nx, ny));
                isVisited[nx][ny] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            map = new char[h][w];
            isVisited = new boolean[h][w];
            for (int j = 0; j < h; j++) {
                String s = br.readLine();
                map[j] = s.toCharArray();
            }
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    if (!isVisited[j][k] && map[j][k] == '#') {
                        bfs(j, k);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
