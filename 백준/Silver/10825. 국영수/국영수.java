import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class score {
        String name;
        int kor;
        int eng;
        int math;

        score(String s, int k, int e, int m) {
            this.name = s;
            this.kor = k;
            this.eng = e;
            this.math = m;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<score> list = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.add(new score(name, k, e, m));
        }
        Collections.sort(list, new Comparator<score>() {
            @Override
            public int compare(score o1, score o2) {
                if (o1.kor == o2.kor) {
                    if (o1.eng == o2.eng) {
                        if (o1.math == o2.math) return o1.name.compareTo(o2.name);
                        return o2.math - o1.math;
                    }
                    return o1.eng - o2.eng;
                }
                return o2.kor - o1.kor;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (score s: list) sb.append(s.name).append("\n");
        System.out.println(sb);
    }
}
