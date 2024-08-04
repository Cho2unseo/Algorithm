import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            System.out.print("Distances: ");
            for (int j = 0; j < s1.length(); j++) {
                int d = 0;
                char a = s1.charAt(j);
                char b = s2.charAt(j) ;
                if (a > b) d = (b + 26) - a;
                else d = b - a;
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
