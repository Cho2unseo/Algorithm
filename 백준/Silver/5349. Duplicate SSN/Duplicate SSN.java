import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new TreeMap<>();
        while (true) {
            String s = br.readLine();
            if (s.equals("000-00-0000")) break;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s: map.keySet()) {
            if (map.get(s) >= 2) System.out.println(s);
        }
    }
}
