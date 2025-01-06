import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[] arr;
    static int[] ans;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void recursive(int depth) throws IOException {
        if (depth == m) {
            for (int num: ans) bw.write(num + " ");
            bw.write("\n");
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
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        recursive(0);
        bw.flush();
        bw.close();
    }
}
