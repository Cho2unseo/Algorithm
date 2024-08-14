import java.util.Scanner;

public class Main {

    public static int gcd(int n1, int n2) {
        if (n1 % n2 == 0) return n2;
        return gcd(n2, n1 % n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int l;
        if (s.length() > t.length()) {
            l = gcd(s.length(), t.length());
            l = s.length() * t.length() / l;
        }
        else {
            l = gcd(t.length(), s.length());
            l = s.length() * t.length() / l;
        }
        String ns = "";
        String nt = "";
        for (int i = 0; i < l / s.length(); i++) ns += s;
        for (int i = 0; i < l / t.length(); i++) nt += t;
        if (ns.equals(nt)) System.out.println(1);
        else System.out.println(0);
    }
}
