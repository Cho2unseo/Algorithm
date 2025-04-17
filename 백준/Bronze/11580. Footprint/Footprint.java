import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[2001][2001];
        int garo = 1000;
        int sero = 1000;
        String s = br.readLine();
        arr[sero][garo] = true;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == 'E') garo++;
            else if (s.charAt(i) == 'W') garo--;
            else if (s.charAt(i) == 'S') sero--;
            else if (s.charAt(i) == 'N') sero++;
            if (!arr[sero][garo]) arr[sero][garo] = true;
        }
        int cnt = 0;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (arr[i][j]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
