import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Score {
        int count;
        int penalty;

        Score(int count, int penalty) {
            this.count = count;
            this.penalty = penalty;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Score> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Score(a, b));
        }
        list.sort(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if (o1.count == o2.count) return o1.penalty - o2.penalty;
                return o2.count - o1.count;
            }
        });
        Score five = list.get(4);
        int count = 0;
        int ck = 0;
        for (Score a: list) {
            ck++;
            if (ck > 5) {
                if (a.count == five.count) count++;
            }
        }
        System.out.println(count);
    }
}
