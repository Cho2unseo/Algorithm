import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[27][27];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] a = s.split(" is ");
            int u = a[0].charAt(0) - 'a';
            int v = a[1].charAt(0) - 'a';
//            System.out.println(u + " " + v);
            map[u][v] = true;
        }
        int m = Integer.parseInt(br.readLine());
        for (int k = 0; k <= 26; k++) {
            for (int i = 0; i <= 26; i++) {
                for (int j = 0; j <= 26; j++) {
                    if (map[i][k] && map[k][j]) map[i][j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            String[] a = s.split(" is ");
            int u = a[0].charAt(0) - 'a';
            int v = a[1].charAt(0) - 'a';
            if (!map[u][v]) System.out.println("F");
            else System.out.println("T");
        }
    }
}
