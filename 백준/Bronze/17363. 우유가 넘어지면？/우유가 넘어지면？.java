import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<Character, Character> h = new HashMap<Character, Character>();
    public static void init() {
        h.put('.', '.');
        h.put('O', 'O');
        h.put('-', '|');
        h.put('|', '-');
        h.put('/', '\\');
        h.put('\\', '/');
        h.put('^', '<');
        h.put('<', 'v');
        h.put('v', '>');
        h.put('>', '^');
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] p = new char[n][m];
        init();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                p[i][j] = h.get(s[0].charAt(j));
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(p[j][i]);
            }
            System.out.println();
        }
    }
}