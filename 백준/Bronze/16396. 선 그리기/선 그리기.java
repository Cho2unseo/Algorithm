import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10001];
        int cnt = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < y; j++) {
                arr[j] = 1;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (arr[i] == 1) cnt++;
        }

        System.out.println(cnt);
    }
}
