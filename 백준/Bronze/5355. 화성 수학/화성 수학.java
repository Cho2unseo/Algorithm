import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double n = Double.parseDouble(st.nextToken());
            while (st.hasMoreTokens()) {
                String com = st.nextToken();
                if (com.equals("@")) n *= 3;
                else if (com.equals("%")) n += 5;
                else n -= 7;
            }
            String res = String.format("%.2f", n);
            System.out.println(res);
        }
    }

}
