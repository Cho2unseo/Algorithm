import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] arr;
    static boolean[] isVisited;
    static int[] cal;
    static int a;
    static int b;

    static int bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        isVisited[x] = true;
        queue.offer(x);
        while (!queue.isEmpty()) {
            int p = queue.poll();
            if (p == b) return cal[p];
            for (int i = 1; i <= n; i++) {
                if (!isVisited[i] && arr[p][i] == 1) {
                    isVisited[i] = true;
                    cal[i] = cal[p] + arr[p][i];
                    queue.offer(i);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        isVisited = new boolean[n + 1];
        cal = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        System.out.println(bfs(a));
    }
}
