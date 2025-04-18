import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int flag = 0;
        int ck = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') flag = 1;
            if (flag == 1) {
                System.out.print(s.charAt(i));
                if (s.charAt(i) == '>') flag = 0;
            }
            else {
                if (s.charAt(i) != ' ') stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ' ') {
                while (!stack.isEmpty()) {
                    ck = 1;
                    System.out.print(stack.pop());
                }
                if (ck == 1) {
                    System.out.print(" ");
                    ck = 0;
                }
            }
            if (i != s.length() - 1 && s.charAt(i + 1) == '<') {
                while (!stack.isEmpty()) System.out.print(stack.pop());

            }
        }
        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
}
