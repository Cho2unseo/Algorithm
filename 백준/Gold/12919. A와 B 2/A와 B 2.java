import java.util.Scanner;

public class Main {

    static String s;
    static String t;
    static int ans;

    static void recursive(String ss) {
        if (s.length() == ss.length()) {
            if (s.equals(ss)) ans = 1;
            return;
        }
        if (ss.endsWith("A")) {
            recursive(ss.substring(0, ss.length() - 1));
        }
        if (ss.startsWith("B")) {
            recursive(new StringBuilder(ss.substring(1)).reverse().toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        t = sc.next();
        recursive(t);
        System.out.println(ans);
    }
}
