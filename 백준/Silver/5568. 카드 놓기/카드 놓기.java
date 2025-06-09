import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        Set<String> set = new HashSet<>();
        if (k == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) set.add(arr[i] + arr[j]);
                }
            }
        }
        else if (k == 3) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < n; l++) {
                        if (!(i == j || j == l || i == l)) set.add(arr[i] + arr[j] + arr[l]);
                    }
                }
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < n; l++) {
                        for (int m = 0; m < n; m++) {
                            if (!(i == j || j == l || l == m || m == i || m == j || i == l)) set.add(arr[i] + arr[j] + arr[l] + arr[m]);
                        }
                    }
                }
            }
        }
        System.out.println(set.size());
    }
}
