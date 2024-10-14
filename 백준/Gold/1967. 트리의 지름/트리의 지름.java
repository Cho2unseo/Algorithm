import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static class Node {
        int num;
        int len;
        Node(int num, int len) {
            this.num = num;
            this.len = len;
        }
    }

    static int n;
    static ArrayList<Node>[] list;
    static boolean[] isVisited;
    static int max;

    static void dfs(int num, int len) {
        for (Node node: list[num]) {
            if (!isVisited[node.num]) {
                isVisited[node.num] = true;
                dfs(node.num, node.len + len);
            }
        }
        max = Math.max(max, len);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            list[parent].add(new Node(child, len));
            list[child].add(new Node(parent, len));
        }
        for (int i = 1; i <= n; i++) {
            isVisited = new boolean[n + 1];
            isVisited[i] = true;
            dfs(i, 0);
        }
        System.out.println(max);
    }
}
