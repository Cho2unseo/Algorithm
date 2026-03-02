import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("1 2 ".repeat(n / 2));
        if (n % 2 == 1) System.out.println("3");
    }
}
