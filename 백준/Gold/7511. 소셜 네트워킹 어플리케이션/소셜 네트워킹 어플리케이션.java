import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;

    static int find(int x) {
        if (arr[x] == x) return x;
        return find(arr[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x <= y) arr[y] = x;
        else arr[x] = y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            for (int j = 0; j < n; j++) arr[j] = j;
            int k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (find(a) != find(b)) union(a, b);
            }
            System.out.println("Scenario " + i + ":");
            int m = Integer.parseInt(br.readLine());
            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                if (find(u) == find(v)) System.out.println(1);
                else System.out.println(0);
            }
            System.out.println();
        }
    }
}
