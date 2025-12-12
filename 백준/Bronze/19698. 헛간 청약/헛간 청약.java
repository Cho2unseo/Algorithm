import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
        int max = (w / l) * (h / l);
        System.out.println(Math.min(n, max));
    }
}
