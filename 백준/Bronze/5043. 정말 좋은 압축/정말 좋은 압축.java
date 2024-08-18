import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long b = sc.nextLong();
        Long tot = 1L;
        for (int i = 1; i <= b + 1; i++) {
            tot = tot * 2;
        }
        tot--;
        if (tot >= n) System.out.println("yes");
        else System.out.println("no");
    }
}
