import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (int i = 0; i < n - 1; i++) {
            String s = br.readLine();
            if (map.get(s) > 1) map.put(s, map.getOrDefault(s, 0) - 1);
            else map.remove(s);
        }
        System.out.println(map.lastKey());
    }
}
