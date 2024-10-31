import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = 1, q;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        q = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            p = (long) arr[i - 1] * q + p;
            long tmp = p;
            p = q;
            q = tmp;
        }
        p = q - p;

        System.out.println(p + " " + q);
    }
}
