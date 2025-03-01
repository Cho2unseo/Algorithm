import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 3) System.out.println(0);
        else if (n == 4) System.out.println(1);
        else System.out.println((n * (n - 1) * (n - 2) * (n - 3)) / 24);
    }
}
