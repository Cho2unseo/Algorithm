import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            System.out.print(s);
            if (s.charAt(s.length() - 1) == '.') System.out.println();
            else System.out.println(".");
        }
    }
}
