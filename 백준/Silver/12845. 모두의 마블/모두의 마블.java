import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        sum += max * (n - 2);
        System.out.println(sum);
    }
}
