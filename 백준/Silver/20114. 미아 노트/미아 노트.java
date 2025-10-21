import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[] str = new char[n];
        Arrays.fill(str, '?');
        for (int i = 0; i < h; i++) {
            String a = br.readLine();
            for (int j = 0; j < n; j++) {
                if (str[j] == '?') {
                    for (int k = j * w; k < j * w + w; k++) {
                        if (a.charAt(k) != '?') str[j] = a.charAt(k);
                    }
                }
            }
        }
        for (char a: str) System.out.print(a);
    }
}
