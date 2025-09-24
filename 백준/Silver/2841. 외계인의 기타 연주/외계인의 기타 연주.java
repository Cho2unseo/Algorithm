import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        Stack<Integer>[] stack = new Stack[7];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken());
            int pp = Integer.parseInt(st.nextToken());
            if (stack[line] == null) stack[line] = new Stack<>();
            if (stack[line].isEmpty()) {
                stack[line].push(pp);
                cnt++;
            }
            else {
                while (!stack[line].isEmpty() && stack[line].peek() > pp) {
                    stack[line].pop();
                    cnt++;
                }
                if (stack[line].isEmpty() || stack[line].peek() != pp) {
                    stack[line].push(pp);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
