import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        arr[1] = 0;
        if (n == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 2; i <= n; i++) arr[i] = arr[i - 1] + (i - 1);
        System.out.println(arr[n]);
    }
}
