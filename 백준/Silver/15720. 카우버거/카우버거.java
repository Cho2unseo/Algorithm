import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        Integer[] bs = new Integer[b];
        Integer[] cs = new Integer[c];
        Integer[] ds = new Integer[d];
        int before = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            bs[i] = Integer.parseInt(st.nextToken());
            before += bs[i];
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            cs[i] = Integer.parseInt(st.nextToken());
            before += cs[i];
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < d; i++) {
            ds[i] = Integer.parseInt(st.nextToken());
            before += ds[i];
        }
        Arrays.sort(bs, Collections.reverseOrder());
        Arrays.sort(cs, Collections.reverseOrder());
        Arrays.sort(ds, Collections.reverseOrder());
        int min = Math.min(b, Math.min(c, d));
        int after = 0;
        for (int i = 0; i < min; i++) {
            after = (int) (after + (bs[i] + cs[i] + ds[i]) * 0.9);
        }
        for (int i = min; i < b; i++) after += bs[i];
        for (int i = min; i < c; i++) after += cs[i];
        for (int i = min; i < d; i++) after += ds[i];
        System.out.println(before);
        System.out.println(after);
    }
}
