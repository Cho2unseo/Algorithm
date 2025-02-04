import java.util.Scanner;

public class Main {

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(":");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int res = gcd(a, b);
        System.out.println(a / res + ":" + b / res);
    }
}
