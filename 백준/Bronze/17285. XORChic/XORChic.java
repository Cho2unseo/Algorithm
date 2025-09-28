import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int n = t.charAt(0) ^ 'C';
        for (int i = 0; i < t.length(); i++) System.out.print((char) (t.charAt(i) ^ n));
    }
}
