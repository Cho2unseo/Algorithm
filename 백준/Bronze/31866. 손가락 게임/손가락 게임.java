import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) System.out.println("=");
            else if (b == 2) System.out.println(">");
            else if (b == 5) System.out.println("<");
            else System.out.println(">");
        }
        else if (a == 2) {
            if (b == 0) System.out.println("<");
            else if (b == 2) System.out.println("=");
            else if (b == 5) System.out.println(">");
            else System.out.println(">");
        }
        else if (a == 5) {
            if (b == 0) System.out.println(">");
            else if (b == 2) System.out.println("<");
            else if (b == 5) System.out.println("=");
            else System.out.println(">");
        }
        else {
            if (b == 0 || b == 2 || b == 5) System.out.println("<");
            else System.out.println("=");
        }
    }
}
