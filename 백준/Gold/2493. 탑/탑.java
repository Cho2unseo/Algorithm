import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<int[]> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (stack.isEmpty()) {
                System.out.print(0 + " ");
                stack.push(new int[] {num, i + 1});
            }
            else {
                while (true) {
                    if (stack.isEmpty()) {
                        System.out.print(0 + " ");
                        stack.push(new int[] {num, i + 1});
                        break;
                    }
                    else {
                        int top = stack.peek()[0];
                        if (top > num) {
                            System.out.print(stack.peek()[1] + " ");
                            stack.push(new int[] {num, i + 1});
                            break;
                        }
                        else stack.pop();
                    }
                }

            }
        }
    }
}
