class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        if (t.length() == len) {
            if (t.equals(p)) return 1;
            else return 0;
        }
        for (int i = 0; i < t.length() - len + 1; i++) {
            if (Long.parseLong(t.substring(i, i + len)) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}