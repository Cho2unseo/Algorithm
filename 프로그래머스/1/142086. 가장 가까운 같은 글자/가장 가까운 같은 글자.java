class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) alpha[i] = -1;
        for (int i = 0; i < s.length(); i++) {
            if (alpha[s.charAt(i) - 'a'] == -1) answer[i] = -1;
            else answer[i] = i - alpha[s.charAt(i) - 'a'];
            alpha[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < answer.length; i++) System.out.println(answer[i]);
        return answer;
    }
}