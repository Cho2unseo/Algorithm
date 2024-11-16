import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static class st {
        String name;
        int day;
        int month;
        int year;
        public st(String n, int d, int m, int y) {
            this.name = n;
            this.day = d;
            this.month = m;
            this.year = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<st> std = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            std.add(new st(name, d, m, y));
        }
        std.sort(new Comparator<st>() {
            @Override
            public int compare(st o1, st o2) {
                if (o1.year == o2.year) {
                    if (o1.month == o2.month) {
                        return o1.day - o2.day;
                    }
                    return o1.month - o2.month;
                }
                return o1.year - o2.year;

            }
        });
        System.out.println(std.getLast().name);
        System.out.println(std.getFirst().name);
    }
}
