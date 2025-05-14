import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 3 == 0) System.out.println('S');
        else if (n % 3 == 1) System.out.println('U');
        else System.out.println('O');
    }
}
