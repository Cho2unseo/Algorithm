import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[15];
        for (int i = 0; i < 15; i++) arr[i] = br.readLine();
        for (int i = 0; i < 15; i++) {
            if (arr[i].contains("w")) {
                System.out.println("chunbae");
                break;
            }
            else if (arr[i].contains("b")) {
                System.out.println("nabi");
                break;
            }
            else if (arr[i].contains("g")) {
                System.out.println("yeongcheol");
                break;
            }
        }
    }
}
