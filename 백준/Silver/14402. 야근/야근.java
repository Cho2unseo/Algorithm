import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<String> p = new LinkedList<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String w = st.nextToken();
            if (w.equals("+")) {
                p.add(name);
            }
            else if (w.equals("-")) {
                if (!p.contains(name)) cnt++;
                p.remove(name);
            }
        }
        System.out.println(p.size() + cnt);
    }
}
