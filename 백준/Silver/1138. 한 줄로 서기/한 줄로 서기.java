import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) seq[i] = Integer.parseInt(st.nextToken());
        List<Integer> list = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) list.add(seq[i], i + 1);
        for (int a: list) System.out.print(a + " ");
    }
}
