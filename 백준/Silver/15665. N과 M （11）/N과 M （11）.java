import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int[] ans;
    static int n;
    static int m;
    static LinkedHashSet<String> set;

    static void recursive(int depth) {
        if (depth == m) {
            StringBuilder sb = new StringBuilder();
            for (int num: ans) sb.append(num).append(" ");
            set.add(sb.toString());
            return;
        }
        for (int i = 0; i < n; i++) {
            ans[depth] = arr[i];
            recursive(depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        ans = new int[m];
        set = new LinkedHashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        recursive(0);
        for (String s: set) System.out.println(s);
    }
}
