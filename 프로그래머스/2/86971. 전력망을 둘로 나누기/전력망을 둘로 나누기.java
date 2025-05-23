import java.util.*;

class Solution {
    
    private int bfs(int start, List<List<Integer>> graph, int n) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] isVisited = new boolean[n];
        int count = 1;
        isVisited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int a: graph.get(cur)) {
                if (!isVisited[a]) {
                    queue.offer(a);
                    isVisited[a] = true;
                    count++;
                }
            }
        }
        return count;
    }
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0] - 1;
            int b = wires[i][1] - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0] - 1;
            int b = wires[i][1] - 1;
            graph.get(a).remove(Integer.valueOf(b));
            graph.get(b).remove(Integer.valueOf(a));
            int res = bfs(a, graph, n);
            graph.get(a).add(b);
            graph.get(b).add(a);
            int diff = Math.abs(n - 2 * res);
            answer = Math.min(answer, diff);
        }
        return answer;
    }
}