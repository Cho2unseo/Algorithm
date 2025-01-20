import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag = 0;
        int n = 0;
        for (int i = 1; i <= 3; i++) {
            String s = br.readLine();
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                flag = i;
                n = Integer.parseInt(s);
            }
        }
        n += 3 - flag + 1;
        if (n % 3 == 0 && n % 5 == 0) System.out.println("FizzBuzz");
        else if (n % 3 == 0) System.out.println("Fizz");
        else if (n % 5 == 0) System.out.println("Buzz");
        else System.out.println(n);
    }
}
