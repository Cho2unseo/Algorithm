import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = m; i <= n; i++) {
            int tmp = i;
            while (tmp != 0) {
                arr[tmp % 10]++;
                tmp /= 10;
            }
        }
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
    }
}
