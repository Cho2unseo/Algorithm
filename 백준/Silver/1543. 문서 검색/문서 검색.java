import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int cnt = 0;
        a = a.replace(b, "*");
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '*') cnt++;
        }
        System.out.println(cnt);
    }
}
