import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        TreeSet<Integer> ta = new TreeSet<Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            ta.add(tmp);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            ta.remove(tmp);
        }
        System.out.println(ta.size());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (!ta.isEmpty()) {
            for (int i: ta) bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}
