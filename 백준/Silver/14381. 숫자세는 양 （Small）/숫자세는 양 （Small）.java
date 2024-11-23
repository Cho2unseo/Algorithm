import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int flag = 0;
            int n = Integer.parseInt(br.readLine());
            System.out.print("Case #" + i + ": ");
            int[] arr = new int[10];
            for (int j = 1; j < 200; j++) {
                int tmp = n * j;
                while (tmp > 0) {
                    arr[tmp % 10]++;
                    tmp /= 10;
                }
                flag = 0;
                for (int k = 0; k < 10; k++) {
                    if (arr[k] > 0) flag++;
                }
                if (flag == 10) {
                    System.out.println(n * j);
                    break;
                }
            }
            if (flag != 10) System.out.println("INSOMNIA");
        }
    }
}
