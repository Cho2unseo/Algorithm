import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int flag = 0;
            for (int j = 1; j < 100000; j++) {
                if (j * j == n) {
                    System.out.println(1);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println(0);
        }
    }
}
