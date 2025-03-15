import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = br.readLine();
        String[] copy = s.clone();
        Arrays.sort(copy);
        if (Arrays.equals(s, copy)) System.out.println("INCREASING");
        else {
            copy = s.clone();
            Arrays.sort(copy, Collections.reverseOrder());
            if (Arrays.equals(s, copy)) System.out.println("DECREASING");
            else System.out.println("NEITHER");
        }
    }
}
