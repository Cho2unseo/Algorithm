import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i <= k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            int min = arr[0];
            int max = arr[n - 1];
            int gap = 0;
            for (int j = 0; j < n - 1; j++) gap = Math.max(gap, arr[j + 1] - arr[j]);
            System.out.println("Class " + i);
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
        }
    }
}
