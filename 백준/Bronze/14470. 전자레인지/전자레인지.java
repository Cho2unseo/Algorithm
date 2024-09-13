import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int time = 0;
        if (a <= 0) {
            time += Math.abs(a) * c;
            time += d;
            time += e * b;
        }
        else time += e * (b - a);
        System.out.println(time);
    }
}
