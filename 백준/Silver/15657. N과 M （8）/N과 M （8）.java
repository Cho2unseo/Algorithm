import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[] arr;
    static int[] ans;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void recursive(int depth, int start) throws IOException {
        if (depth == m) {
            for (int a: ans) bw.write(a + " ");
            bw.write("\n");
            return;
        }
        for (int i = start; i < n; i++) {
            ans[depth] = arr[i];
            recursive(depth + 1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        ans = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        recursive(0, 0);
        bw.flush();
        bw.close();
    }
}
