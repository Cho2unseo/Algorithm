import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int[] arr = new int[27];
            int flag = 0;
            for (int j = 0; j < s.length(); j++) {
                int idx = s.charAt(j) - 'A';
                arr[idx]++;
                if (arr[idx] >= 3) {
                    if (j != s.length() - 1) {
                        if (s.charAt(j) != s.charAt(j + 1)) {
                            flag = 1;
                            break;
                        }
                        else {
                            arr[idx] = 0;
                            j++;
                        }
                    }
                    else flag = 1;
                }
            }
            if (flag == 0) System.out.println("OK");
            else System.out.println("FAKE");
        }
    }
}
