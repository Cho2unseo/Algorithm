class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') answer += ' ';
            else {
                char c = (char) (s.charAt(i) + n);
                if (s.charAt(i) <= 'Z') {
                    if (c > 'Z') c -= 26;
                }
                else {
                    if (c > 'z') c-= 26;
                }
                answer += c;
            }
        }
        return answer;
    }
}