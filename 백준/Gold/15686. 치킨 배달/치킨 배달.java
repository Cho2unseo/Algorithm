import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[][] arr;
    static List<Point> house;
    static List<Point> chicken;
    static int res = Integer.MAX_VALUE;
    static boolean[] visit;

    static class Point {
        int r;
        int c;

        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static void recursive(int depth, int start) {
        if (depth == m) {
            int cnt = 0;
            for (Point point : house) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < chicken.size(); j++) {
                    if (visit[j]) {
                        int dist = Math.abs(point.r - chicken.get(j).r) + Math.abs(point.c - chicken.get(j).c);
                        min = Math.min(min, dist);
                    }
                }
                cnt += min;
            }
            res = Math.min(res, cnt);
            return;
        }
        for (int i = start; i < chicken.size(); i++) {
            visit[i] = true;
            recursive(depth + 1, i + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        house = new ArrayList<>();
        chicken = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) house.add(new Point(i, j));
                else if (arr[i][j] == 2) chicken.add(new Point(i, j));
            }
        }
        visit = new boolean[chicken.size()];
        recursive(0, 0);
        System.out.println(res);
    }
}
