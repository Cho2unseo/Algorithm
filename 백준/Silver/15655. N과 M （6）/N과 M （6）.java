import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[] arr;
    static int[] ans;
    static boolean[] isVisited;

    static void recursive(int depth, int start) {
        if (depth == m) {
            for (int num: ans) System.out.print(num + " ");
            System.out.println();
            return;
        }
        for (int i = start; i < n; i++) {
            int tmp = 0;
            if (!isVisited[i]) {
                if (tmp < arr[i]) {
                    tmp = arr[i];
                    ans[depth] = arr[i];
                    isVisited[i] = true;
                    recursive(depth + 1, i);
                    isVisited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        ans = new int[m];
        isVisited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        recursive(0, 0);
    }
}
