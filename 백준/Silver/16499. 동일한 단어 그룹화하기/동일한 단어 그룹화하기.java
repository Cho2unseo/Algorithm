import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            StringBuilder news = new StringBuilder();
            for (int j = 0; j < s.length(); j++) news.append(arr[j]);
            set.add(String.valueOf(news));
        }
        System.out.println(set.size());
    }
}
