import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] w = new int[10];
        int[] k = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) w[i] = sc.nextInt();
        for (int i = 0; i < 10; i++) k[i] = sc.nextInt();
        Arrays.sort(w);
        Arrays.sort(k);
        int sw = w[7] + w[8] + w[9];
        int sk = k[7] + k[8] + k[9];
        System.out.println(sw);
        System.out.println(sk);
    }
}
