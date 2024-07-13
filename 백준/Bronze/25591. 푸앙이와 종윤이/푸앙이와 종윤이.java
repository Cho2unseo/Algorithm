import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, a, b, c, d, q, r, front, rear;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        a = 100 - n1;
        b = 100 - n2;
        c = 100 - (a + b);
        d = a * b;
        q = d / 100;
        r = d % 100;
        front = c + q;
        rear = r;
        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println(front + " " + rear);
    }
}
