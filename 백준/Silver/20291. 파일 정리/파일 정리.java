import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] str = s.split("\\.");
            if (map.containsKey(str[1])) {
                int cnt = map.get(str[1]);
                map.put(str[1], cnt + 1);
            }
            else map.put(str[1], 1);
        }
        Object[] arr = map.keySet().toArray();
        Arrays.sort(arr);
        for (Object a: arr) {
            System.out.println(a + " " + map.get(a));
        }
    }
}
