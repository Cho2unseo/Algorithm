import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int f, s, g, u, d;
    static int[] arr;
    static int[] move;

    public static void bfs(int start) {
        boolean[] isVisited = new boolean[f + 1];
        move = new int[f + 1];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        isVisited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == g) {
                System.out.println(move[node]);
                return;
            }
            int next = node + u;
            if (next <= f && next >= 1) {
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    queue.offer(next);
                    move[next] = move[node] + 1;
                }
            }
            next = node - d;
            if (next <= f && next >= 1) {
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    queue.offer(next);
                    move[next] = move[node] + 1;
                }
            }
        }
        System.out.println("use the stairs");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        s = sc.nextInt();
        g = sc.nextInt();
        u = sc.nextInt();
        d = sc.nextInt();
        arr = new int[f + 1];
        bfs(s);
    }
}
