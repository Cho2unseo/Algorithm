import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) trees[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(trees);
        int left = 0;
        int right = trees[n - 1];
        int res = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                if (trees[i] > mid) cnt += (trees[i] - mid);
            }
            if (cnt >= m) {
                res = mid;
                left = mid + 1;
            }
            else right = mid - 1;
        }
        System.out.println(res);
    }
}
