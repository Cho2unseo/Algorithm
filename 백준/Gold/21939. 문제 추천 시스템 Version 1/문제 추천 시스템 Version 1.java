import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    static class Problems {
        int p;
        int l;

        public Problems(int p, int l) {
            this.p = p;
            this.l = l;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<Problems> set = new TreeSet<>(new Comparator<Problems>() {
            @Override
            public int compare(Problems o1, Problems o2) {
                if (o1.l == o2.l) return o2.p - o1.p;
                return o2.l - o1.l;
            }
        });
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            set.add(new Problems(p, l));
            map.put(p, l);
        }
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("recommend")) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 1) {
                    System.out.println(set.first().p);
                }
                else if (x == -1) {
                    System.out.println(set.last().p);
                }
            }
            else if (s.equals("add")) {
                int p = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());
                map.put(p, l);
                set.add(new Problems(p, l));
            }
            else if (s.equals("solved")) {
                int p = Integer.parseInt(st.nextToken());
                set.remove(new Problems(p, map.get(p)));
                map.remove(p);
            }
        }
    }
}
