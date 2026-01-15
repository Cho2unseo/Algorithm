import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> ring = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if (!b.equals("-")) {
                map.put(a, b);
                ring.put(b, ring.getOrDefault(b, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> e: ring.entrySet()) {
            if (e.getValue() == 2) set.add(e.getKey());
        }
        System.out.println(set.size());
        if (!set.isEmpty()) {
            for (String s: set) {
                for (Map.Entry<String, String> e: map.entrySet()) {
                    if (e.getValue().equals(s)) System.out.print(e.getKey() + " ");
                }
                System.out.println();
            }
        }
    }
}
