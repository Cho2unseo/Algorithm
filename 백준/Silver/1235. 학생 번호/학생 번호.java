import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        for (int i = 1; i <= arr[0].length(); i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                String a = arr[j].substring(arr[j].length() - i);
                set.add(a);
            }
            if (set.size() == n) {
                System.out.println(i);
                return;
            }
        }
    }
}
