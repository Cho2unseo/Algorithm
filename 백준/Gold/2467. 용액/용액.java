import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int start = 0;
        int end = n - 1;
        int l = 0, r = 0;
        long min = Long.MAX_VALUE;
        while (start < end) {
            long sum = arr[start] + arr[end];
            if (min > Math.abs(sum)) {
                min = Math.abs(sum);
                l = start;
                r = end;
            }
            if (sum >= 0) end--;
            else start++;

        }
        System.out.print(arr[l] + " " + arr[r]);
    }
}
