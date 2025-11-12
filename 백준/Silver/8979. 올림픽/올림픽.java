import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static class Score {
        int idx;
        int a;
        int b;
        int c;

        Score(int idx, int a, int b, int c) {
            this.idx = idx;
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Score> scores = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            scores.add(new Score(idx, a, b, c));
        }
        scores.sort(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if (o1.a == o2.a) {
                    if (o1.b == o2.b) {
                        if (o1.c == o2.c) {
                            return o1.idx - o2.idx;
                        }
                        return o2.c - o1.c;
                    }
                    return o2.b - o1.b;
                }
                return o2.a - o1.a;
            }
        });
        int cnt = 1;
        int tar = 0;
        for (int i = 0; i < n; i++) {
            if (scores.get(i).idx == k) {
                tar = i;
                break;
            }
            cnt++;
        }
        int m = cnt;
        for (int i = m - 2; i >= 0; i--) {
            if (scores.get(tar).c == scores.get(i).c && scores.get(tar).b == scores.get(i).b && scores.get(tar).a == scores.get(i).a) {
                cnt--;
            }
            else break;
        }
        System.out.println(cnt);
    }
}
