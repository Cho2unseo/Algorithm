import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static class Keys {
        int a;
        int b;
        String c;

        public Keys(int a, int b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Keys> keys = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String c = st.nextToken();
            keys.add(new Keys(a, b, c));
        }
        keys.sort(new Comparator<Keys>() {
            @Override
            public int compare(Keys o1, Keys o2) {
                if (o1.b == o2.b) {
                    return o1.a - o2.a;
                }
                return o1.b - o2.b;
            }
        });
        for (int i = 0; i < m; i++) System.out.print(keys.get(i).c);
    }
}
