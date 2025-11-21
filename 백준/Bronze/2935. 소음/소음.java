import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        if (b.equals("*")) {
            System.out.print("1");
            for (int i = 0; i < a.length() - 1 + c.length() - 1;  i++) System.out.print("0");
        }
        else {
            if (a.equals(c)) {
                System.out.print("2");
                for (int i = 0; i < a.length() - 1; i++) System.out.print("0");
            }
            else {
                int max = Math.max(a.length() - 1, c.length() - 1);
                int min = Math.min(a.length() - 1, c.length() - 1);
                System.out.print("1");
                for (int i = 0; i < max - min - 1; i++) System.out.print("0");
                System.out.print("1");
                for (int i = 0; i < min; i++) System.out.print("0");
            }
        }
    }
}
