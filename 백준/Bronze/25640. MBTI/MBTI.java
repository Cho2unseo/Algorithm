import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            if (a.equals(s)) cnt++;
        }
        System.out.println(cnt);
    }
}
