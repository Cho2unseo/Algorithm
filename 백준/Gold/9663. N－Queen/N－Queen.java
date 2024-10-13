import java.util.Scanner;

public class Main {

    static int n;
    static int[] arr;
    static int cnt;

    static boolean check(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i] || Math.abs(arr[col] - arr[i]) == Math.abs(col - i)) return false;
        }
        return true;
    }

    static void queen(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if (check(depth)) queen(depth + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        queen(0);
        System.out.println(cnt);
    }
}
