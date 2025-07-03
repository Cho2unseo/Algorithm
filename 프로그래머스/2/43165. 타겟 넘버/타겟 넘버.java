class Solution {
    
    int dfs(int[] numbers, int target, int sum, int idx) {
        if (numbers.length == idx) {
            return (target == sum) ? 1 : 0;
        }
        int count = 0;
        count += dfs(numbers, target, sum + numbers[idx], idx + 1);
        count += dfs(numbers, target, sum - numbers[idx], idx + 1);
        return count;
    }
    
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
}