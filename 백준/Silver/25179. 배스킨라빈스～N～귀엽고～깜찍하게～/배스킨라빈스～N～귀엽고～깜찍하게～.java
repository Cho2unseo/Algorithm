import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (n % (m + 1) != 1) System.out.println("Can win");
        else System.out.println("Can't win");
    }
}
