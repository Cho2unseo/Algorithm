import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();
            cnt += n * 5;
        }
        System.out.println(cnt);
    }
}
