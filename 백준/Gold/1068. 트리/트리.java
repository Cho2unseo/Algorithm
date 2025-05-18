import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<List<Integer>> tree;
    static int ans;

    static void search(int er, int node) {
        if (tree.get(node).contains(er)) tree.get(node).remove(Integer.valueOf(er));
        if (tree.get(node).isEmpty()) ans++;
        else {
            for (int a: tree.get(node)) search(er, a);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) tree.add(new ArrayList<>());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int root = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == -1) root = i;
            else tree.get(a).add(i);
        }
        int er = Integer.parseInt(br.readLine());
        if (er == root) {
            System.out.println(0);
            return;
        }
        search(er, root);
        System.out.println(ans);
    }
}
