import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] map;
    static int white;
    static int blue;

    static int is_all(int x, int y, int size) {
        int color = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (color != map[i][j]) return -1;
            }
        }
        if (color == 0) return 0; // 모두 흰색이면
        else return 1; // 모두 파란색이면
    }

    static void divide(int x, int y, int size) {
        if (is_all(x, y, size) == 0) white++;
        else if (is_all(x, y, size) == 1) blue++;
        else {
            size = size / 2;
            divide(x, y, size);
            divide(x, y + size, size);
            divide(x + size, y, size);
            divide(x + size, y + size, size);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }
        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
}
