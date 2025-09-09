import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            if (name.equals("jinju")) max = price;
            arr[i] = price;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) count++;
        }
        System.out.println(max);
        System.out.println(count);
    }
}
