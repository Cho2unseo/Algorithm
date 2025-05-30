import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String maxS = "";
            int max = 0;
            for (int j = 0; j < n; j++) {
                String s = br.readLine();
                String[] str = s.split(" ");
                String school = str[0];
                int l = Integer.parseInt(str[1]);
                if (max < l) {
                    maxS = school;
                    max = l;
                }
            }
            System.out.println(maxS);
        }
    }
}
