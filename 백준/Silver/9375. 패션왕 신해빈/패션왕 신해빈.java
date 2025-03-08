import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            HashMap<String, Integer> closet = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String clothes = st.nextToken();
                String type = st.nextToken();
                closet.put(type, closet.getOrDefault(type, 0) + 1);
            }
            int res = 1;
            for (Map.Entry<String, Integer> a: closet.entrySet()) res *= (a.getValue() + 1);
            System.out.println(res - 1);
        }

    }
}
