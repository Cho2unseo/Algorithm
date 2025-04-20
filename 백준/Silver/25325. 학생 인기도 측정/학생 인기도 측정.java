import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        String[] students = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            students[i] = st.nextToken();
            map.put(students[i], 0);
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (map.get(o1).equals(map.get(o2))) {
                    return o1.compareTo(o2);
                }
                return map.get(o2) - map.get(o1);
            }
        });
        for (String s: list) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
