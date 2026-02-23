import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<String, Integer> a: map.entrySet()) max = Math.max(max, a.getValue());
        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Integer> a: map.entrySet()) {
            if (a.getValue() == max) list.add(a.getKey());
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String s: list) System.out.println(s);
    }
}
