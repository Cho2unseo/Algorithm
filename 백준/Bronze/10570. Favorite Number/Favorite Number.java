import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int max = 0;
            int maxi = 0;
            int[] p = new int[1000];
            for (int j = 0; j < v; j++) {
                int num = sc.nextInt();
                p[num - 1]++;
            }
            for (int j = 0; j < 1000; j++) {
                if (p[j] > max) {
                    max = p[j];
                    maxi = j + 1;
                }
            }
            System.out.println(maxi);
        }
    }
}
