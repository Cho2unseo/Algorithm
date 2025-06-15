import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        String s = sb.toString();
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            res += (int) (Math.pow(2, s.length() - 1 - i) * (s.charAt(i) - '0'));
        }
        System.out.println(res);
    }
}
