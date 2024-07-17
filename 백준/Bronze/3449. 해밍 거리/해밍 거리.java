import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            String a = sc.nextLine();
            String b = sc.nextLine();
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j)) cnt++;
            }
            System.out.println("Hamming distance is " + cnt + ".");
        }
    }
}
