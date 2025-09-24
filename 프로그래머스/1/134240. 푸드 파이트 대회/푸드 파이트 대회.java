class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) answer += i;
        }
        answer += "0";
        int len = answer.length();
        for (int i = 1; i < len; i++) answer += answer.charAt(len - 1 - i);
        return answer;
    }
}