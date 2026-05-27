class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int turn = 0;
        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') cnt++;
            }
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            turn++;
        }
        answer[0] = turn;
        answer[1] = cnt;
        return answer;
    }
}