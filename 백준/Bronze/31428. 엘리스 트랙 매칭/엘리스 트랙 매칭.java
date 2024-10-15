import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        String s = br.readLine();
        arr = s.split(" ");
        String hello = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String tmp = String.valueOf(arr[i]);
            if (tmp.equals(hello)) cnt++;
        }

        System.out.println(cnt);
    }
}
