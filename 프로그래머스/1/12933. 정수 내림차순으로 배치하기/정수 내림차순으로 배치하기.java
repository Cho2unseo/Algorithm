import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "";
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) answer = answer * 10 + (arr[i] - '0');
        return answer;
    }
}