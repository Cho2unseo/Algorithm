import java.util.Scanner;

public class Main {

    static boolean check(int n) {
        String s = String.valueOf(n);
        if (s.length() == 1) return true;
        int cha = s.charAt(0) - s.charAt(1);
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) - s.charAt(i + 1) != cha) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (check(i)) cnt++;
        }
        System.out.println(cnt);
    }
}
