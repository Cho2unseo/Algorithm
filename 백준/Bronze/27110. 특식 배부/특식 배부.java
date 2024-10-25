import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        sum += Math.min(a, n) + Math.min(b, n) + Math.min(c, n);
        System.out.println(sum);
    }
}
