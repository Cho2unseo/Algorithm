import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) arr[i] = br.readLine();
            Arrays.sort(arr);
            System.out.println(t++);
            for (int i = 0; i < n; i++) System.out.println(arr[i]);
        }
    }
}
