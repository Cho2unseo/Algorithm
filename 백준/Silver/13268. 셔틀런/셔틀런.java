import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n % 100;
        if (n == 0 || n == 10 || n == 30 || n == 60) System.out.println(0);
        else if (n <= 15 || (n >= 25 && n <= 35) || (n >= 55 && n <= 65) || n >= 95) System.out.println(1);
        else if (n <= 40 || (n >= 50 && n < 55) || (n > 65 && n <= 70) || n >= 90) System.out.println(2);
        else if (n <= 75 || n >= 85) System.out.println(3);
        else System.out.println(4);
    }
}