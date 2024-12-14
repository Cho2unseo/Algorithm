import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] people = new int[k];
            for (int j = 0; j < k; j++) people[j] = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int fast = 24 * 60;
            int fam = 0;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                int h = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                if (h == -1) continue;
                for (int aa = 0; aa < k; aa++) {
                    if (people[aa] == num) {
                        if (h < 6) cnt++;
                        else if (h == 6) {
                            if (m == 0) cnt++;
                        }
                        if (fast > h * 60 + m) {
                            fast = h * 60 + m;
                            fam = num;
                        }
                    }
                }
            }
            System.out.println(fam + " " + cnt);
        }
    }
}
