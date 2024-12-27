import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int[] arr;
    static boolean[] isVisited;
    static int[] ans;
    static LinkedHashSet<String> set;

    static void recursive(int depth) {
        if (depth == m) {
            StringBuilder sb = new StringBuilder();
            for (int num: ans) sb.append(num).append(" ");
            set.add(sb.toString());
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
        isVisited = new boolean[n];
        ans = new int[m];
        set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        recursive(0);
        set.forEach(System.out::println);
    }
}
