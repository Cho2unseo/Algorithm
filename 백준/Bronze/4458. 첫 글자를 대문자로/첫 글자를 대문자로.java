import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (j == 0) {
                    if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                        System.out.print((char) (s.charAt(j) - ('a' - 'A')));
                        continue;
                    }
                }
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
