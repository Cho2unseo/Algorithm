import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String s = br.readLine();
                map.put(s, map.getOrDefault(s, 1));
            }
            int cnt = 0;
            for (String m: map.keySet()) {
                if (map.get(m) == 1) cnt++;
            }
            System.out.println(cnt);
        }
    }
}