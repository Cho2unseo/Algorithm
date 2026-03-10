import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) queue.offer(Integer.valueOf(br.readLine()));
        int cnt = 0;
        while (queue.size() > 1) {
            int tmp = queue.poll() + queue.poll();
            cnt += tmp;
            queue.offer(tmp);
        }
        System.out.println(cnt);
    }
}
