import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 4) System.out.println(20);
        else if (s.length() == 2) System.out.println(Integer.parseInt(String.valueOf(s.charAt(0))) + Integer.parseInt(String.valueOf(s.charAt(1))));
        else {
            if (s.contains("0")) {
                if (s.charAt(1) == '0') System.out.println(10 + Integer.parseInt(String.valueOf(s.charAt(2))));
                else System.out.println(10 + Integer.parseInt(String.valueOf(s.charAt(0))));
            }
        }
    }
}
