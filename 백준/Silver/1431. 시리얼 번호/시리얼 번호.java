import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int a = 0;
                    int b = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) >= '0' && o1.charAt(i) <= '9') a += o1.charAt(i) - '0';
                        if (o2.charAt(i) >= '0' && o2.charAt(i) <= '9') b += o2.charAt(i) - '0';
                    }
                    if (a == b) {
                        return o1.compareTo(o2);
                    }
                    return a - b;

                }
                return o1.length() - o2.length();
            }
        });
        for (String s: arr) System.out.println(s);
    }
}
