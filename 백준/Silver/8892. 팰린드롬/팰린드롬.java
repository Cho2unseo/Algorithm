import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean is_pelin(String s) {
        for (int start = 0, end = s.length() - 1; start < s.length() / 2; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int flag = 0;
            int k = Integer.parseInt(br.readLine());
            String[] arr = new String[k];
            for (int j = 0; j < k; j++) arr[j] = br.readLine();
            for (int j = 0; j < k; j++) {
                for (int m = j + 1; m < k; m++) {
                    String ns = arr[j] + arr[m];
                    if (is_pelin(ns)) {
                        flag = 1;
                        System.out.println(ns);
                        break;
                    }
                    else {
                        ns = arr[m] + arr[j];
                        if (is_pelin(ns)) {
                            flag = 1;
                            System.out.println(ns);
                            break;
                        }
                    }
                }
                if (flag == 1) break;
            }
            if (flag == 0) System.out.println(0);
        }
    }
}
