import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int max = 0;
            int cnt = 1;
            String s = br.readLine();
            for (int j = 0; j < 7; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) cnt++;
                else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
            System.out.println(max);
        }
    }
}