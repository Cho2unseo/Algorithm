import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((long) n * n <= 100000000L) System.out.println("Accepted");
        else System.out.println("Time limit exceeded");
    }
}
