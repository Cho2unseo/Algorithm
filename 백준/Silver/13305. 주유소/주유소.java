import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] road = new long[n - 1];
        for (int i = 0; i < n - 1; i++) road[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] price = new int[n];
        for (int i = 0; i < n; i++) price[i] = Integer.parseInt(st.nextToken());
        int prev = price[0];
        long min = 0;
        for (int i = 0; i < n; i++) {
            if (prev > price[i]) prev = price[i];
            if (i != n - 1) min += prev * road[i];
        }
        System.out.println(min);
    }
}
