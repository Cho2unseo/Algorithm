import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            LinkedList<String> list = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) list.add(st.nextToken());
            while (true) {
                String s = br.readLine();
                if (s.equals("what does the fox say?")) break;
                st = new StringTokenizer(s);
                int flag = 0;
                while (st.hasMoreTokens()) {
                    if (st.nextToken().equals("goes")) flag = 1;
                    if (flag == 1) {
                        String m = st.nextToken();
                        list.removeIf(a -> a.equals(m));
                    }
                }
            }
            for (String a: list) System.out.print(a + " ");
        }
    }
}
