import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static class Mentor {
        String m1;
        String m2;

        public Mentor(String m1, String m2) {
            this.m1 = m1;
            this.m2 = m2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Mentor[] mentors = new Mentor[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String m1 = st.nextToken();
            String m2 = st.nextToken();
            mentors[i] = new Mentor(m1, m2);
        }
        Arrays.sort(mentors, new Comparator<Mentor>() {
            @Override
            public int compare(Mentor o1, Mentor o2) {
                if (o1.m1.equals(o2.m1)) return o2.m2.compareTo(o1.m2);
                return o1.m1.compareTo(o2.m1);
            }
        });
        for (Mentor s: mentors) System.out.println(s.m1 + " " + s.m2);
    }
}
