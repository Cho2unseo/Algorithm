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
        int a = 1;
        for (int i = 0; i < n - 3; i++) {
            int b = 1;
            a *= arr[i];
            for (int j = i + 1; j < n - 2; j++) {
                int c = 1;
                b *= arr[j];
                for (int k = j + 1; k < n - 1; k++) {
                    c *= arr[k];
                    int d = 1;
                    for (int l = k + 1; l < n; l++) {
                        d *= arr[l];
                    }
                    max = Math.max(max, a + b + c + d);
                }
            }
        }
        System.out.println(max);
    }
}
