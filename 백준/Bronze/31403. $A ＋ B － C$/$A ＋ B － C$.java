import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int cc = Integer.parseInt(c);
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - cc);
        System.out.println(Integer.parseInt(a + b) - cc);
    }
}
