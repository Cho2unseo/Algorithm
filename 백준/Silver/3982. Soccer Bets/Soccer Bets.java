import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            HashSet<String> set = new LinkedHashSet<>();
            HashSet<String> loser = new LinkedHashSet<>();
            for (int j = 0; j < 16; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                int aa = Integer.parseInt(st.nextToken());
                int bb = Integer.parseInt(st.nextToken());
                if (aa > bb) {
                    if (!loser.contains(a)) set.add(a);
                    set.remove(b);
                    loser.add(b);
                }
                else {
                    if (!loser.contains(b)) set.add(b);
                    set.remove(a);
                    loser.add(a);
                }
            }
            for (String s: set) System.out.println(s);
        }
    }
}
