import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = s.toCharArray();
        }
        int a = Integer.parseInt(br.readLine());
        if (a == 1) {
            for (int i = 0; i < n; i++) System.out.println(arr[i]);
        }
        else if (a == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][n - j - 1]);
                }
                System.out.println();
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[n - i - 1][j]);
                }
                System.out.println();
            }
        }
    }
}
