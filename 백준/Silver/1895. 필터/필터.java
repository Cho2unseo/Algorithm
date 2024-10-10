import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int t = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                int[] tmp = new int[9];
                int idx = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        tmp[idx++] = arr[k][l];
                    }
                }
                Arrays.sort(tmp);
                if (tmp[4] >= t) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
