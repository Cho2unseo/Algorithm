import java.util.*;

class Solution {
    static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (s.charAt(i) == '}') {
                    if (top != '{') return false;
                }
                else if (s.charAt(i) == ']') {
                    if (top != '[') return false;
                }
                else if (s.charAt(i) == ')') {
                    if (top != '(') return false;
                }
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
    
    public int solution(String s) {
        int answer = 0;
        String news = s + s;
        for (int i = 0; i < s.length(); i++) {
            String rotatedS = news.substring(i, i + s.length());
            // System.out.println(rotatedS);
            if (check(rotatedS)) answer++;
        }
        return answer;
    }
}