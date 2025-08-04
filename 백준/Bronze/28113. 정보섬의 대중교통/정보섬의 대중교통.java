import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n <= b) n = 0;
        if (n + b < a) System.out.println("Subway");
        else if (n + b == a) System.out.println("Anything");
        else System.out.println("Bus");
    }
}
