import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] map;
    static int m1;
    static int zero;
    static int p1;

    static int is_all(int x, int y, int size) {
        int num = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (num != map[i][j]) return -2;
            }
        }
        return num;
    }

    static void divide(int x, int y, int size) {
        if (is_all(x, y, size) == -1) m1++;
        else if (is_all(x, y, size) == 0) zero++;
        else if (is_all(x, y, size) == 1) p1++;
        else {
            size = size / 3;
            divide(x, y, size);
            divide(x, y + size, size);
            divide(x, y + size * 2, size);
            divide(x + size, y, size);
            divide(x + size, y + size, size);
            divide(x + size, y + size * 2, size);
            divide(x + size * 2, y, size);
            divide(x + size * 2, y + size, size);
            divide(x + size * 2, y + size * 2, size);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, n);
        System.out.println(m1);
        System.out.println(zero);
        System.out.println(p1);
    }
}
