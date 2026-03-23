import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static class Score {
        int a;
        int b;
        Score(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Score> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.add(new Score(a, b));
            }
            list.sort(new Comparator<Score>() {
                @Override
                public int compare(Score o1, Score o2) {
                    if (o1.a == o2.a) return o1.b - o2.b;
                    return o1.a - o2.a;
                }
            });
            int cnt = 1;
            int min = list.get(0).b;
            for (int j = 1; j < n; j++) {
                if (list.get(j).b < min) {
                    cnt++;
                    min = list.get(j).b;
                }
            }
            System.out.println(cnt);
        }
    }
}
