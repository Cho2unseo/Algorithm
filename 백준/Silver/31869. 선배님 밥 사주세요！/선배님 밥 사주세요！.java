import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static class Memo {
        int week;
        int day;
        int price;

        public Memo(int week, int day, int price) {
            this.week = week;
            this.day = day;
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Memo> sun = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int w = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            sun.put(s, new Memo(w, d, p));
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int p = Integer.parseInt(st.nextToken());
            if (sun.get(s).price > p) sun.remove(s);
        }
        boolean[][] cal = new boolean[11][7];
        Iterator <Map.Entry<String, Memo>> entryIterator = sun.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Memo> entry = entryIterator.next();
            cal[entry.getValue().week][entry.getValue().day] = true;
        }
        int cnt = 0;
        int max = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 7; j++) {
                if (!cal[i][j]) {
                    max = Math.max(max, cnt);
                    cnt = 0;
                }
                else cnt++;
            }
        }
        max = Math.max(max, cnt);
        System.out.println(max);
    }
}
