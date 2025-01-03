import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;

    static int[] arr;
    static int[] ans;
    static boolean[] isVisited;
    static LinkedHashSet<String> set;

    static void recursive(int depth, int start) {
        if (depth == m) {
            StringBuilder sb = new StringBuilder();
            for (int num: ans) sb.append(num).append(" ");
            set.add(sb.toString());
            return;
        }
        int tmp = 0;
        for (int i = start; i < n; i++) {
            if (!isVisited[i]) {
                if (tmp < arr[i]) {
                    tmp = arr[i];
                    ans[depth] = arr[i];
                    recursive(depth + 1, i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        ans = new int[m];
        isVisited = new boolean[n];
        set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        recursive(0, 0);
        for (String s: set) System.out.println(s);
    }
}
