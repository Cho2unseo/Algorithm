import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            if (s.length() % 2 == 0) {
                stack.push(s.charAt(0));
                for (int j = 1; j < s.length(); j++) {
                    if (stack.isEmpty()) stack.push(s.charAt(j));
                    else {
                        if (stack.peek() == s.charAt(j)) stack.pop();
                        else stack.push(s.charAt(j));
                    }
                }
            }
            else continue;
            if (stack.isEmpty()) cnt++;
        }
        System.out.println(cnt);
    }
}
