import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int sum = 0;
        int min = 100;
        int mini = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (min > arr[i]) {
                mini = i;
                min = arr[i];
            }
        }
        if (sum >= 100) System.out.println("OK");
        else {
            if (mini == 0) System.out.println("Soongsil");
            else if (mini == 1) System.out.println("Korea");
            else System.out.println("Hanyang");
        }
    }
}
