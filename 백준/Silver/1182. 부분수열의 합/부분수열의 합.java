import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static boolean[] isVisited;
    static int n;
    static int s;
    static int res;

    static void recursive(int depth, int sum) {
        if (depth == n) {
            if (sum == s) res++;
            return;
        }
        recursive(depth + 1, sum + arr[depth]);
        recursive(depth + 1, sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];
        isVisited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        recursive(0, 0);
        System.out.println(s == 0 ? res - 1 : res);
    }
}
