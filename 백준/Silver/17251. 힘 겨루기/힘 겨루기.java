import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = 0;
        int start = 0;
        int end = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                start = i;
                end = i;
            }
            else if (max == arr[i]) end = i;
        }
        if (start == n - end - 1) System.out.println("X");
        else if (start > n - 1 - end) System.out.println("B");
        else System.out.println("R");
    }
}
