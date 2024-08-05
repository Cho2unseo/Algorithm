import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0, maxi = 0;
        for (int i = 0; i < n; i++) {
            int x[] = new int[5];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                x[j] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        sum = x[j] + x[k] + x[l];
                        if (sum % 10 >= max) {
                            max = sum % 10;
                            maxi = i + 1;
                        }
                    }
                }
            }
        }
        System.out.println(maxi);
    }
}
