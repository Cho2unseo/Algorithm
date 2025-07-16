import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            map.put(s, score);
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = br.readLine();
            sum += map.get(s);
            map.remove(s);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        int min = sum;
        int max = sum;
        for (int i = 0; i < m - k; i++) {
            min += map.get(keySet.get(i));
        }
        for (int i = map.size() - 1; i >= map.size() - m + k; i--) {
            max += map.get(keySet.get(i));
        }
        System.out.println(min + " " + max);
    }
}
