import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                if (i >= s.length() - 1) {
                    System.out.println("NO");
                    return;
                }
                if (s.charAt(i + 1) == 'i') i++;
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else if (s.charAt(i) == 'k') {
                if (i >= s.length() - 1) {
                    System.out.println("NO");
                    return;
                }
                if (s.charAt(i + 1) == 'a') i++;
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else if (s.charAt(i) == 'c') {
                if (i >= s.length() - 2) {
                    System.out.println("NO");
                    return;
                }
                if (s.charAt(i + 1) == 'h' && s.charAt(i + 2) == 'u') i += 2;
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
