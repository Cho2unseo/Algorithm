import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[][] pic = new int[r + 1][c + 1];
        int[][] pre = new int[r + 1][c + 1];
        for (int i = 1; i <= r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= c; j++) {
                pic[i][j] = Integer.parseInt(st.nextToken());
                if (j == 1) pre[i][j] = pic[i][j];
                else pre[i][j] = pre[i][j - 1] + pic[i][j];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j = r2; j >= r1; j--) {
                sum += (pre[j][c2] - pre[j][c1 - 1]);
            }
            bw.write(String.valueOf(sum / ((r2 - r1 + 1) * (c2 - c1 + 1))));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
