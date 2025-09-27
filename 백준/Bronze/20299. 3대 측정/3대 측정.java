import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        List<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if (arr[j] < l) {
                    sum = 0;
                    break;
                }
                sum += arr[j];
            }
            if (sum >= k) {
                String s = "";
                for (int j = 0; j < 3; j++) s += arr[j] + " ";
                list.add(s);
            }
        }
        System.out.println(list.size());
        for (String s: list) System.out.print(s);
    }
}
