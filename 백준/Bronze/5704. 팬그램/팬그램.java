import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int flag = 0;
            String s = br.readLine();
            int[] a = new int[26];
            if (s.equals("*")) break;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') a[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (a[i] == 0) {
                    flag = 1;
                    System.out.println("N");
                    break;
                }
            }
            if (flag == 0) System.out.println("Y");
        }
    }
}
