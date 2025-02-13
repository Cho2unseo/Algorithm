import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int[] ans;
    static int k;
    static boolean[] isVisited;

    static void recursive(int depth, int start) {
        if (depth == 6) {
            for (int a: ans) System.out.print(a + " ");
            System.out.println();
            return;
        }
        for (int i = start; i < k; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                ans[depth] = arr[i];
                recursive(depth + 1, i);
                isVisited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if (k == 0) break;
            arr = new int[k];
            ans = new int[6];
            isVisited = new boolean[k];
            for (int i = 0; i < k; i++) arr[i] = Integer.parseInt(st.nextToken());
            recursive(0, 0);
            System.out.println();
        }
    }
}
