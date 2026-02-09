import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(s);
        visited[s] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int next = cur - arr[cur];
            if (next > 0) {
                queue.offer(next);
                visited[next] = true;
            }
            next = cur + arr[cur];
            if (next <= n) {
                queue.offer(next);
                visited[next] = true;
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
