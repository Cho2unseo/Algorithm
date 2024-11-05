import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] pz = new char[r][c];
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            pz[i] = s.toCharArray();
        }
        for (int i = 0; i < r; i++) {
            StringBuilder ns = new StringBuilder();
            for (int j = 0; j < c; j++) {
                if (pz[i][j] != '#') ns.append(pz[i][j]);
                else {
                    if (ns.length() > 1) set.add(String.valueOf(ns));
                    else ns = new StringBuilder();
                }
            }
            if (ns.length() > 1) set.add(String.valueOf(ns));
        }
        for (int i = 0; i < c; i++) {
            StringBuilder ns = new StringBuilder();
            for (int j = 0; j < r; j++) {
                if (pz[j][i] != '#') ns.append(pz[j][i]);
                else {
                    if (ns.length() > 1) set.add(String.valueOf(ns));
                    else ns = new StringBuilder();
                }
            }
            if (ns.length() > 1) set.add(String.valueOf(ns));
        }
        for (String s: set) {
            System.out.println(s);
            break;
        }
    }
}
