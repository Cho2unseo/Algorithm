import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] arr;
    static boolean[] isVisited;
    static int min = 100000;

    static void comb(int depth, int idx) {
        if (depth == n / 2) {
            int start = 0;
            int link = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (isVisited[i] && isVisited[j]) start += arr[i][j] + arr[j][i];
                    else if (!isVisited[i] && !isVisited[j]) link += arr[i][j] + arr[j][i];
                }
            }
            min = Math.min(min, Math.abs(start - link));
        }
        for (int i = idx; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                comb(depth + 1, i + 1);
                isVisited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        isVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        comb(0, 0);
        System.out.println(min);
    }
}
