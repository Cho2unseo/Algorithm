import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int l;
    static int c;
    static char[] arr;
    static char[] ans;

    static boolean check() {
        int mo = 0;
        int ja = 0;
        for (char a: ans) {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') mo++;
            else ja++;
        }
        return mo >= 1 && ja >= 2;
    }

    static void dfs(int depth, int start) {
        if (depth == l) {
            if (check()) {
                for (char a: ans) System.out.print(a);
                System.out.println();
            }
            return;
        }
        for (int i = start; i < arr.length; i++) {
            ans[depth] = arr[i];
            dfs(depth + 1, i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new char[c];
        ans = new char[l];
        for (int i = 0; i < c; i++) arr[i] = st.nextToken().charAt(0);
        Arrays.sort(arr);
        dfs(0, 0);
    }
}
