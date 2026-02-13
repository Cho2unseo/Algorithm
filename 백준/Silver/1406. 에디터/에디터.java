import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int m = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        Stack<Character> nstack = new Stack<>();
        for (int i = 0; i < s.length(); i++) stack.push(s.charAt(i));
        for (int i = 0; i < m; i++) {
            String com = br.readLine();
            if (com.equals("L")) {
                if (!stack.isEmpty()) nstack.push(stack.pop());
            }
            else if (com.equals("D")) {
                if (!nstack.isEmpty()) stack.push(nstack.pop());
            }
            else if (com.equals("B")) {
                if (!stack.isEmpty()) stack.pop();
            }
            else stack.push(com.charAt(2));
        }
        while (!stack.isEmpty()) nstack.push(stack.pop());
        while (!nstack.isEmpty()) bw.write(nstack.pop());
        bw.flush();
        bw.close();
    }
}
