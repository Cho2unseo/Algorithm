import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += Math.max(a, b);
            int[] arr = new int[5];
            for (int j = 0; j < 5; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            sum += arr[3] + arr[4];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
