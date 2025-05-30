import java.util.*;

class Solution {
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];
        queue.offer(new int[] {0, 0, 1});
        isVisited[0][0] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (cur[0] == maps.length - 1 && cur[1] == maps[0].length - 1) return cur[2];
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length) continue;
                if (!isVisited[nx][ny] && maps[nx][ny] == 1) {
                    queue.offer(new int[] {nx, ny, cur[2] + 1});
                    isVisited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}