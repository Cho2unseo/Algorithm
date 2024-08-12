import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 100 <= 5) System.out.println(1);
        else if (n % 100 <= 17) System.out.println(2);
        else if (n % 100 <= 28) System.out.println(3);
        else System.out.println(4);
    }
}
