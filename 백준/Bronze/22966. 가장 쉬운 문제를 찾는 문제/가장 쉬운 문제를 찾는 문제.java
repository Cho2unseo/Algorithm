import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new LinkedHashMap<>();
        int min = 5;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            min = Math.min(min, a);
            map.put(s, a);
        }
        for (Map.Entry<String, Integer> a: map.entrySet()) {
            if (a.getValue() == min) {
                System.out.println(a.getKey());
                break;
            }
        }
    }
}
