import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) return x;
        return find(parent[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x < y) parent[y] = x;
        else if (x > y) parent[x] = y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp == 1) union(i, j);
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[m + 1];
        for (int i = 0; i < m; i++) arr[i] = Integer.parseInt(st.nextToken());
        int root = find(arr[0]);
        for (int i = 1; i < m; i++) {
            if (find(arr[i]) != root) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
