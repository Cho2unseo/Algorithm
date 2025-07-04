import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });
        int count = 0;
        int idx = 0;
        int time = 0;
        int total = 0;
        while (count < jobs.length) {
            while (idx < jobs.length && time >= jobs[idx][0]) {
                pq.add(jobs[idx]);
                idx++;
            }
            if (!pq.isEmpty()) {
                int[] job = pq.remove();
                time += job[1];
                total += time - job[0];
                count++;
            } else {
                time = jobs[idx][0];
            }
        }
        return total / jobs.length;
    }
}