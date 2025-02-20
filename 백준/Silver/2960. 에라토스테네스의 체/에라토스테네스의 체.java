import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if (!arr[j]) {
                    arr[j] = true;
                    cnt++;
                    if (cnt == k) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}
