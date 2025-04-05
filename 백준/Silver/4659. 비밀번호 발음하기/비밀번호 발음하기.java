import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean is_mo(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int mo = 0;
            int flag = 0;
            String s = br.readLine();
            if (s.equals("end")) break;
            char prev = '1';
            int mocnt = 0;
            int jacnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (is_mo(s.charAt(i))) mo++;
                if (is_mo(s.charAt(i))) {
                    mocnt++;
                    jacnt = 0;
                }
                else {
                    jacnt++;
                    mocnt = 0;
                }
                if (mocnt == 3 || jacnt == 3) {
                    flag = 1;
                    break;
                }
                if (prev == s.charAt(i)) {
                    if (s.charAt(i) != 'e' && s.charAt(i) != 'o') {
                        flag = 1;
                        break;
                    }
                }
                prev = s.charAt(i);
            }
            if (flag == 1 || mo == 0) System.out.println("<" + s + "> is not acceptable.");
            else System.out.println("<" + s + "> is acceptable.");
        }
    }
}
