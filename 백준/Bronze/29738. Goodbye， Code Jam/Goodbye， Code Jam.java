import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.print("Case #" + i + ": ");
            if (n <= 25) System.out.println("World Finals");
            else if (n <= 1000) System.out.println("Round 3");
            else if (n <= 4500) System.out.println("Round 2");
            else System.out.println("Round 1");
        }
    }
}
