import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static class pos {
        long x;
        long y;

        public pos(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        pos[] list = new pos[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[i] = new pos(x, y);
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long a = (list[i].x - list[j].x) * (list[i].x - list[j].x) + (list[i].y - list[j].y) * (list[i].y - list[j].y);
                    long b = (list[j].x - list[k].x) * (list[j].x - list[k].x) + (list[j].y - list[k].y) * (list[j].y - list[k].y);
                    long c = (list[k].x - list[i].x) * (list[k].x - list[i].x) + (list[k].y - list[i].y) * (list[k].y - list[i].y);
                    if (a == 0 || b == 0 || c == 0) continue;
//                    a = (long) Math.pow(a, 2);
//                    b = (long) Math.pow(b, 2);
//                    c = (long) Math.pow(c, 2);
                    if (a + b == c || b + c == a || c + a == b) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
