import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int bn = 0;
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            bn = gcd(bn, arr[i + 1] - arr[i]);
        }
        System.out.println((arr[n - 1] - arr[0]) / bn + 1 - n);
    }
}
