import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            if (Integer.parseInt(arr[0]) >= 1000 || Integer.parseInt(arr[1]) >= 1600 || Integer.parseInt(arr[2]) >= 1500 || (Integer.parseInt(arr[3]) != -1 && Integer.parseInt(arr[3]) <= 30)) cnt++;
        }
        System.out.println(cnt);
    }
}
