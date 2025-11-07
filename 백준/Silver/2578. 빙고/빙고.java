import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean isDone;

    static void func(boolean[][] isVisited) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (isVisited[i][j]) cnt++;
            }
            if (cnt == 5) count++;
        }
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (isVisited[j][i]) cnt++;
            }
            if (cnt == 5) count++;
        }
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == 4) {
                    if (isVisited[i][j]) cnt++;
                }
            }
            if (cnt == 5) count++;
        }
        cnt = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    if (isVisited[i][j]) cnt++;
                }
            }
            if (cnt == 5) count++;
        }
        if (count >= 3) isDone = true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[5][5];
        int[] nums = new int[26];
        int idx = 0;
        boolean[][] isVisited = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                nums[map[i][j]] = i * 5 + j;
            }
        }
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int a = Integer.parseInt(st.nextToken());
                isVisited[nums[a] / 5][nums[a] % 5] = true;
                if (!isDone) idx++;
                func(isVisited);
            }
        }
        System.out.println(idx);
    }
}
