import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        list.add(st.nextToken());
        list.add(st.nextToken());
        st = new StringTokenizer(br.readLine());
        list.add(st.nextToken());
        list.add(st.nextToken());
        Set<String> set = new HashSet<>();
        StringBuilder sb = null;
        for (String a: list) {
            for (String b: list) {
                sb = new StringBuilder();
                sb.append(a).append(" ").append(b);
                set.add(sb.toString());
            }
        }
        List<String> tset = new ArrayList<>(set);
        Collections.sort(tset);
        for (String a: tset) System.out.println(a);
    }
}
