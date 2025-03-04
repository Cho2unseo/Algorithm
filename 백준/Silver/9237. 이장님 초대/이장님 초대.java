import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) t[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(t);
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, (n - i) + t[i]);
        }
        System.out.println(max + 1);

    }
}
