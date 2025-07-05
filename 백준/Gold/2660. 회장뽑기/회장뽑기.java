import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(map[i], 50 * 50);
            map[i][i] = 0;
        }
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1) break;
            map[a][b] = 1;
            map[b][a] = 1;
        }
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }
        int[] score = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= n; j++) max = Math.max(max, map[i][j]);
            score[i] = max;
        }
        List<Integer> list = new ArrayList<>();
        int min = 251;
        for (int i = 1; i <= n; i++) {
            min = Math.min(min, score[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (min == score[i]) list.add(i);
        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        }

        System.out.println(min + " " + list.size());
        for (int a: list) System.out.print(a + " ");
    }
}
