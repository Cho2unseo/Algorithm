import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] parent;
    static int[] a;

    static void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (a[px] < a[py]) parent[py] = px;
        else parent[px] = py;
    }

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int sum = 0;
        a = new int[n + 1];
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) a[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            union(v, w);
        }
        for (int i = 1; i <= n; i++) {
            if (i == parent[i]) sum += a[i];
        }
        if (sum <= k) System.out.println(sum);
        else System.out.println("Oh no");
    }
}
