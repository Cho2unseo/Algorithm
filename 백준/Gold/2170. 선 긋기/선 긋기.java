import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[i][0] = x;
            map[i][1] = y;
        }
        Arrays.sort(map, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])  { // x가 같으면 y 끼리 비교
                    return o1[1] - o2[1];
                }
                else return o1[0] - o2[0];
            }
        });
        long res = 0;
        int start = -1000000000, end = -1000000000;
        for (int i = 0; i < n; i++) {
            if (map[i][0] > end) {
                res += end - start;
                start = map[i][0];
                end = map[i][1];
            }
            else if (end < map[i][1]) end = map[i][1];
        }
        res += end - start;
        System.out.println(res);
    }
}
