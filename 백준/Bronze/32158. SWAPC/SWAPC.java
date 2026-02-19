import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int p = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') p++;
            else if (s.charAt(i) == 'C') c++;
        }
        int min = Math.min(p, c);
        StringBuilder sb = new StringBuilder();
        p = c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P' && p < min) {
                sb.append('C');
                p++;
            }
            else if (s.charAt(i) == 'C' && c < min) {
                sb.append('P');
                c++;
            }
            else sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
