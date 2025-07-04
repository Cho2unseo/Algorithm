import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });
        int time = 0; // 현재 시간
        int idx = 0; // jobs 배열에서 현재 확인할 작업
        int total = 0; // 총 반환 시간
        int count = 0; // 완료된 작업 수
        
        while (count < jobs.length) {
            while (idx < jobs.length && jobs[idx][0] <= time) {
                pq.add(jobs[idx]);
                idx++;
            }
            if (!pq.isEmpty()) {
                int[] job = pq.poll(); // 우선 순위 가장 높은 작업 꺼냄
                time += job[1]; // 작업 수행 후 시간 증가
                total += time - job[0]; // 반환 시간 = 종료 - 요청
                count++;
            } else {
                time = jobs[idx][0];
            }
        }
        return total / jobs.length;
    }
}