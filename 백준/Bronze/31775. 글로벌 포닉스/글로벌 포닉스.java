import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        for (int i = 0; i < 3; i++) {
            String s = sc.nextLine();
            if (s.charAt(0) == 'l') x[0] ++;
            else if (s.charAt(0) == 'k') x[1]++;
            else if (s.charAt(0) == 'p') x[2]++;
        }
        for (int i = 0; i < 3; i++) {
            if (x[i] != 1) {
                System.out.println("PONIX");
                return;
            }
        }
        System.out.println("GLOBAL");
    }
}
