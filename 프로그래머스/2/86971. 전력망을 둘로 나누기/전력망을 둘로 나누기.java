import java.util.*;

class Solution {
    
    int bfs(int n, List<List<Integer>> graph, int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] isVisited = new boolean[n];
        int count = 1;
        queue.offer(start);
        isVisited[start] = true;
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
        int answer = 101;
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
            int res = bfs(n, graph, a);
            graph.get(a).add(b);
            graph.get(b).add(a);
            int diff = Math.abs(n - 2 * res);
            answer = Math.min(answer, diff);
        }
        return answer;
    }
}