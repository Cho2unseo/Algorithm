import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[100];
        String[] str = s.split(",");
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        System.out.println(sum);
    }
}
