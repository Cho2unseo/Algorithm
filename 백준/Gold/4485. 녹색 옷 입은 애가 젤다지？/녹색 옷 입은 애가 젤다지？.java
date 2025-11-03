import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
            }
            int[][] dist = new int[n][n];
            for (int i = 0; i < n; i++) Arrays.fill(dist[i], 15000);
            PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[2] - o2[2]);
            queue.offer(new int[] {0, 0, arr[0][0]});
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            dist[0][0] = arr[0][0];
            while (!queue.isEmpty()) {
                int[] p = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = p[0] + dx[i];
                    int ny = p[1] + dy[i];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if (dist[nx][ny] > dist[p[0]][p[1]] + arr[nx][ny]) {
                        dist[nx][ny] = dist[p[0]][p[1]] + arr[nx][ny];
                        queue.offer(new int[] {nx, ny, dist[nx][ny]});
                    }
                }
            }
            System.out.println("Problem " + cnt++ + ": " + dist[n - 1][n - 1]);
        }
    }
}
