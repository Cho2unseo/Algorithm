import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n > 0) cnt++;
        }
        System.out.println(cnt);
    }
}
