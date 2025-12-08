import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            s += a;
        }
        switch (s % 4) {
            case 0:
                System.out.println('N');
                break;
            case 1:
                System.out.println('E');
                break;
            case 2:
                System.out.println('S');
                break;
            default:
                System.out.println('W');
                break;
        }
    }
}
