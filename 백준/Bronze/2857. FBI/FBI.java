import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag = 0;
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            if (s.contains("FBI")) {
                System.out.print((i + 1) + " ");
                flag = 1;
            }
        }
        if (flag == 0) System.out.println("HE GOT AWAY!");
    }
}
