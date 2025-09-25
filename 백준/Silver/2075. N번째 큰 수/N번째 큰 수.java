import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (queue.size() >= n) {
                    queue.add(a);
                    queue.poll();
                }
                else queue.add(a);
            }
        }
        System.out.println(queue.poll());
    }
}
