import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers. length; j++) {
                if (i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int n: set) answer[idx++] = n;
        Arrays.sort(answer);
        return answer;
    }
}