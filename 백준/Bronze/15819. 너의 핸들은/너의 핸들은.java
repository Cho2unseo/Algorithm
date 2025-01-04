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
        String[] s = new String[n];
        int l = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) s[i] = br.readLine();
        Arrays.sort(s);
        System.out.println(s[l - 1]);
    }
}
