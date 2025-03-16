import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] arr = new int[26][s.length()];
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            for (int j = 0; j < 26; j++) {
                if (now - 'a' == j) {
                    if (i >= 1) arr[j][i] = 1 + arr[j][i - 1];
                    else arr[j][i] = 1;
                }
                else {
                    if (i >= 1) arr[j][i] = arr[j][i - 1];
                    else arr[j][i] = 0;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            char ss = (char) (a.charAt(0) - 'a');
            if (l == 0) bw.write(arr[ss][r] + "\n");
            else bw.write((arr[ss][r] - arr[ss][l - 1]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
