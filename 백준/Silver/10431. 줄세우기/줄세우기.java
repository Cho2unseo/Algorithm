import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        for (int i = 0; i < p; i++) {
            int[] arr = new int[20];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 20; j++) arr[j] = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[j] < arr[k]) cnt++;
                }
            }
            System.out.println(t + " " + cnt);
        }
    }
}
