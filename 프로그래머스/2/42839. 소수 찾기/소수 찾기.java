import java.util.*;

class Solution {
    
    Set<Integer> set;
    
    boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    void dfs(String numbers, boolean[] isVisited, String cur) {
        if (cur.length() != 0) {
            int num = Integer.parseInt(cur);
            if (isPrime(num)) set.add(num);
        }
        for (int i = 0; i < numbers.length(); i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                dfs(numbers, isVisited, cur + numbers.charAt(i));
                isVisited[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        set = new HashSet<>();
        boolean[] isVisited = new boolean[numbers.length()];
        dfs(numbers, isVisited, "");
        return set.size();
    }
}