import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int cnt = 0;
        Queue<Long> queue = new ArrayDeque<>();
        queue.offer(a);
        while (!queue.isEmpty()) {
            cnt++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                long cur = queue.poll();
                if (cur == b) {
                    System.out.println(cnt);
                    return;
                }
                long next = cur * 2;
                if (next <= b) queue.offer(next);
                next = cur * 10 + 1;
                if (next <= b) queue.offer(next);
            }
        }
        System.out.println(-1);
    }
}
