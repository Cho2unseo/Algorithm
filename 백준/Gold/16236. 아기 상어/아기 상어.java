import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Pos {
        int x;
        int y;
        int dist;

        Pos(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        int startx = 0;
        int starty = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 9) {
                    startx = i;
                    starty = j;
                    arr[i][j] = 0;
                }
            }
        }
        Queue<Pos> queue = new PriorityQueue<>(new Comparator<Pos>() {
            @Override
            public int compare(Pos o1, Pos o2) {
                if (o1.dist == o2.dist) {
                    if (o1.x == o2.x) return o1.y - o2.y;
                    return o1.x - o2.x;
                }
                return o1.dist - o2.dist;
            }
        });
        queue.offer(new Pos(startx, starty, 0));
        int size = 2;
        int cnt = 0;
        int res = 0;
        while (!queue.isEmpty()) {
            Pos cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    if (arr[nx][ny] <= size) queue.offer(new Pos(nx, ny, cur.dist + 1));
                }
            }
            if (!queue.isEmpty()) {
                Pos curr = queue.peek();
                if (arr[curr.x][curr.y] > 0 && arr[curr.x][curr.y] < size) {
                    cnt++;
                    if (cnt == size) {
                        size++;
                        cnt = 0;
                    }
                    arr[curr.x][curr.y] = 0;
                    queue.clear();
                    queue.offer(new Pos(curr.x, curr.y, 0));
                    res += curr.dist;
                    visited = new boolean[n][n];
                    visited[curr.x][curr.y] = true;
                }
            }
        }
        System.out.println(res);
    }
}
