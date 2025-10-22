import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (!set.contains(s)) cnt++;
            String a = s;
            for (int j = 0; j < s.length(); j++) {
                char tmp = a.charAt(0);
                a = a.substring(1);
                a += tmp;
                set.add(a);
            }
        }
        System.out.println(cnt);
    }
}
