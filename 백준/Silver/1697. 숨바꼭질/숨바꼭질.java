import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int n;
    static int k;
    static int[] map;

    static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        map[start] = 1;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int nx = queue.poll();
            if (nx == k) return map[nx] - 1;
            int px = nx + 1;
            if (px >= 0 && px <= 100000 && map[px] == 0) {
                queue.offer(px);
                map[px] = map[nx] + 1;
            }
            px = nx - 1;
            if (px >= 0 && px <= 100000 && map[px] == 0) {
                queue.offer(px);
                map[px] = map[nx] + 1;
            }
            px = nx * 2;
            if (px >= 0 && px <= 100000 && map[px] == 0) {
                queue.offer(px);
                map[px] = map[nx] + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        map = new int[100001];
        int cnt = bfs(n);
        System.out.println(cnt);
    }
}
