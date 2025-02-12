import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static class con {
        int start;
        int finish;

        public con(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        con[] cons = new con[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            cons[i] = new con(a, b);
        }
        Arrays.sort(cons, new Comparator<con>() {
            @Override
            public int compare(con o1, con o2) {
                if (o1.finish == o2.finish) return o1.start - o2.start;
                return o1.finish - o2.finish;
            }
        });
        int cnt = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (cons[i].start >= tmp) {
                cnt++;
                tmp = cons[i].finish;
            }
        }
        System.out.println(cnt);
    }
}
