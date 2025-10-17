import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length()];
        arr[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - s.charAt(i - 1) > 0) arr[i] = arr[i - 1] + 1;
            else arr[i] = 1;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) sum += arr[i];
        System.out.println(sum);
    }
}
