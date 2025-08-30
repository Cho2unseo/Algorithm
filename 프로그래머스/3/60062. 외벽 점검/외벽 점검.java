class Solution {
    int[][] weakCases;
    // 순열
    int[] tgt;
    int tgtLength;
    boolean[] select;

    int answer = Integer.MAX_VALUE;

    public int solution(int n, int[] weak, int[] dist) {
        // dist 배열이 src 역할
        tgtLength = dist.length;
        tgt = new int[tgtLength];
        select = new boolean[dist.length];

        weakCases = new int[weak.length][weak.length];

        for (int i = 0; i < weak.length; i++) { // 행
            int idx = 0; // 열을 채우는 index
            for (int j = i; j < weak.length + i; j++) { // 열
                // weak[] 범위에 있는 경우
                if (j < weak.length) weakCases[i][idx] = weak[j];
                else weakCases[i][idx] = weak[j - weak.length] + n;
                idx++;
            }
        }
        perm(0, dist);

        if (answer == Integer.MAX_VALUE) return -1;
        return answer;
    }

    public void perm(int tgtIdx, int[] dist) {
        // 기저 조건
        if (tgtIdx == tgtLength) {
            // complete code 친구들의 순서를 뒤섞은 순열이 완성
            check();
            return;
        }
        // dist가 src
        for (int i = 0; i < dist.length; i++) {
            if (select[i]) continue;
            tgt[tgtIdx] = dist[i];
            select[i] = true;
            perm(tgtIdx + 1, dist);
            select[i] = false;
        }
    }

    public void check() {
        for (int[] weakCase: weakCases) {
            int curIdx = 0; // weakCase 상의 index
            int distIdx = 0; // 친구들의 index

            while (curIdx < weakCase.length && distIdx < tgt.length) { // range check
                int nextIdx = curIdx + 1;
                while (nextIdx < weakCase.length && weakCase[nextIdx] - weakCase[curIdx] <= tgt[distIdx]) nextIdx++; // 친구가 여전히 커버 가능
                distIdx++; // 다른 친구로 교체
                curIdx = nextIdx;
            }

            // 취약 지역을 모두 커버했다면
            if (curIdx == weakCase.length) answer = Math.min(answer, distIdx);
        }
    }
}