import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C' || s.charAt(i) == 'A' || s.charAt(i) == 'M' || s.charAt(i) == 'B' || s.charAt(i) == 'R' || s.charAt(i) == 'I' || s.charAt(i) == 'D' || s.charAt(i) == 'G' || s.charAt(i) == 'E') continue;
            else System.out.print(s.charAt(i));
        }
    }
}
