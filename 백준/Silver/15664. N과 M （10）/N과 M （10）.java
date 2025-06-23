import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] arr;
    static int[] ans;
    static boolean[] isVisited;
    static StringBuilder sb;
    static Set<String> set;

    static void recursive(int start, int depth, int n, int m) {
        if (depth == m) {
            sb = new StringBuilder();
            for (int a: ans) sb.append(a).append(" ");
            set.add(sb.toString());
            return;
        }
        for (int i = start; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                ans[depth] = arr[i];
                recursive(i + 1, depth + 1, n, m);
                isVisited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        ans = new int[m];
        isVisited = new boolean[n];
        set = new LinkedHashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        recursive(0, 0, n, m);
        for (String s: set) System.out.println(s);
    }
}
