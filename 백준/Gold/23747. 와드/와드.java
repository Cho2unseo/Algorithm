import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int r, c;
    static char[][] map, sight;
    static boolean[][] isVisited;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        isVisited[x][y] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                    if (!isVisited[nx][ny]) {
                        if (map[now[0]][now[1]] == map[nx][ny]) {
                            isVisited[nx][ny] = true;
                            queue.add(new int[] {nx, ny});
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        sight = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sight[i][j] = '#';
            }
        }
        isVisited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i] = str.toCharArray();
            }
        }
        st = new StringTokenizer(br.readLine());
        int hr = Integer.parseInt(st.nextToken()) - 1;
        int hc = Integer.parseInt(st.nextToken()) - 1;
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') bfs(hr, hc);
            else if (s.charAt(i) == 'U') hr--;
            else if (s.charAt(i) == 'D') hr++;
            else if (s.charAt(i) == 'L') hc--;
            else if (s.charAt(i) == 'R') hc++;
        }
        isVisited[hr][hc] = true;
        for (int i = 0; i < 4; i++) {
            int nx = hr + dx[i];
            int ny = hc + dy[i];
            if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                if (!isVisited[nx][ny]) isVisited[nx][ny] = true;
            }
        }
        /*
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (isVisited[i][j]) {
                    sight[i][j] = '.';
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sight[i][j]);
            }
            System.out.println();
        }

         */
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (isVisited[i][j]) bw.write('.');
                else bw.write('#');
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
