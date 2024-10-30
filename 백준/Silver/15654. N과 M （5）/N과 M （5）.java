import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] arr;
    static int[] ans;
    static boolean[] isVisited;

    static void recursive(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) System.out.print(ans[i] + " ");
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                ans[depth] = arr[i];
                recursive(depth + 1);
                isVisited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ans = new int[n];
        isVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        recursive(0);
    }
}
