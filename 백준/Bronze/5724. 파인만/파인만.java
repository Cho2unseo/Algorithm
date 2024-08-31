import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int sum = 0;
            int n = sc.nextInt();
            if (n == 0) break;
            for (int i = 1; i <= n; i++) sum += i * i;
            System.out.println(sum);
        }
    }
}
