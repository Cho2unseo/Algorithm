import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        arr[1] = 2;
        arr[2] = 4;
        int cnt = 3;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + cnt;
            if (i % 3 != 0) cnt++;
        }
        System.out.println(arr[n]);
    }
}
