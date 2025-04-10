import java.util.Scanner;

public class Main {

    static int n;
    static int[] arr;
    static boolean[] isVisited;
    static StringBuilder sb = new StringBuilder();

    static void recursive(int depth) {
        if (depth == n) {
            for (int a: arr) {
                sb.append(a);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                arr[depth] = i + 1;
                recursive(depth + 1);
                isVisited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        isVisited = new boolean[n];
        recursive(0);
        System.out.println(sb);
    }
}
