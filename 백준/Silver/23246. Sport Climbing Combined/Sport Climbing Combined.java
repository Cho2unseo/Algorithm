import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Score {
        int num;
        int a;
        int b;
        int c;

        Score(int num, int a, int b, int c) {
            this.num = num;
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Score> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new Score(num, a, b, c));
        }
        list.sort(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if (o1.a * o1.b * o1.c == o2.a * o2.b * o2.c) {
                    if (o1.a + o1.b + o1.c == o2.a + o2.b + o2.c) {
                        return o1.num - o2.num;
                    }
                    return (o1.a + o1.b + o1.c) - (o2.a + o2.b + o2.c);
                }
                return (o1.a * o1.b * o1.c) - (o2.a * o2.b * o2.c);
            }
        });
        System.out.println(list.get(0).num + " " + list.get(1).num + " " + list.get(2).num);
    }
}
