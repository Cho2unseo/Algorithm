import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push('(');
            else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') stack.pop();
                }
                else return false;
            }
        }
        if (!stack.isEmpty()) answer = false;

        return answer;
    }
}