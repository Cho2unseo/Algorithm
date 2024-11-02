import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[][] cloud = new char[h][w];
        int[][] min = new int[h][w];
        for (int i = 0; i < h; i++) {
            cloud[i] = br.readLine().toCharArray();
            Arrays.fill(min[i], -1);
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int cnt = 0;
                if (cloud[i][j] == 'c') {
                    min[i][j] = 0;
                }
                for (int k = j; k >= 0; k--) {
                    if (cloud[i][k] == 'c') {
                        min[i][j] = cnt;
                        break;
                    }
                    else cnt++;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) System.out.print(min[i][j] + " ");
            System.out.println();
        }
    }
}
