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
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String name = st.nextToken();
            String[] time = s.split(":");
            int ts = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            if (!map.containsKey(name)) map.put(name, ts);
            else map.put(name, ts + map.get(name));
        }
        Map<String, Integer> money = new HashMap<>();
        for (Map.Entry<String, Integer> a: map.entrySet()) {
            if (a.getValue() <= 100) money.put(a.getKey(), 10);
            else {
                int m = 0;
                if ((a.getValue() - 100) % 50 == 0) m = 10 + ((a.getValue() - 100) / 50) * 3;
                else m = 10 + (((a.getValue() - 100) / 50) + 1) * 3;
                money.put(a.getKey(), m);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(money.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())) return o1.getKey().compareTo(o2.getKey());
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<String, Integer> a: list) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}
