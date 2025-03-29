import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String d = sc.next();
        boolean[] arr = new boolean[b + 1];
        for (int i = 2; i <= b; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= b; j += i) {
                    arr[j] = true;
                }
            }
        }
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (!arr[i]) {
                String ds = String.valueOf(i);
                if (ds.contains(d)) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
