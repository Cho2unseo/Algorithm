import java.util.*;

class Solution {
    int[] parent;

    public int solution(int n, int[][] costs) {
        int answer = 0;

        // 크루스칼

        // makeSet
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i; // value와 index가 동일한, 각각 독립적인 서로소 집합 표현

        // 비용 기준 정렬
        Arrays.sort(costs, (e1, e2) -> e1[2] - e2[2]); // 비용 기준 오름차순 정렬

        int idx = 0; // costs 배열의 index
        int count = 0; // 선택된 간선의 수
        while (true) {
            if (union(costs[idx][0], costs[idx][1])) { // 간선 선택
                answer += costs[idx][2];
                count++;
                if (count == n - 1) break;
            }
            idx++;
        }
        return answer;
    }

    boolean union(int x, int y) {
        // x의 대표 부모, y의 대표 부모
        int px = findSet(x);
        int py = findSet(y);
        if (px == py) return false; // 사이클이 생기는 상황
        if (px < py) parent[py] = px;
        else parent[px] = py;

        return true;
    }

    int findSet(int x) {
        if (parent[x] == x) return x; // 대표
//        return findSet(parent[x]);
        return parent[x] = findSet(parent[x]);
    }
}