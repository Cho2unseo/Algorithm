import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int r;
    static int c;
    static char[][] map;
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int sheep;
    static int wolf;

    static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        int s = 0;
        int w = 0;
        if (map[x][y] == 'v') w++;
        else if (map[x][y] == 'o') s++;
        queue.offer(new Point(x, y));
        isVisited[x][y] = true;
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int px = p.x;
            int py = p.y;
            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if (nx < 0 || ny < 0 || nx >= r || ny >= c || isVisited[nx][ny] || map[nx][ny] == '#') continue;
                if (map[nx][ny] == 'v') w++;
                else if (map[nx][ny] == 'o') s++;
                isVisited[nx][ny] = true;
                queue.offer(new Point(nx, ny));
            }
        }
        if (s > w) sheep += s;
        else wolf += w;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        isVisited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            map[i] = s.toCharArray();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] != '#') {
                    if (!isVisited[i][j]) {
                        bfs(i, j);
                    }
                }
            }
        }
        System.out.println(sheep + " " + wolf);
    }
}
