import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        for (int i = 0; i < arr[0].length(); i++) {
            int cnt = 0;
            char ch = arr[0].charAt(i);
            for (int j = 0; j < n; j++) {
                if (ch != arr[j].charAt(i)) {
                    System.out.print('?');
                    break;
                }
                cnt++;
            }
            if (cnt == n) System.out.print(ch);
        }

    }
}
