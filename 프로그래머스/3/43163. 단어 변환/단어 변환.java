import java.util.*;
class Solution {
    
    class Word {
        String word;
        int count;
        Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    
    int getDiffCount(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++)
            if (word1.charAt(i) != word2.charAt(i)) count++;
        return count;
    }
    
    public int solution(String begin, String target, String[] words) {
        // BFS로 최단 거리 구하기
        // 시작점 예약 (문자열 begin)
        Set<String> visited = new HashSet<>();
        Queue<Word> queue = new ArrayDeque<>();
        queue.offer(new Word(begin, 0));
        visited.add(begin);
        // boolean[] visited = new boolean[words.length];
        // begin으로 가는 경우는 없으니 visited 처리 해줊 필요 X
        while (!queue.isEmpty()) {
            // 현재 노드 방문
            Word cur = queue.poll();
            // if 현재 노드 == target: return count;
            if (cur.word.equals(target)) return cur.count;
            // 다음 노드 방문
            for (String next: words) {
                if (getDiffCount(cur.word, next) == 1) {
                    if (!visited.contains(next)) {
                        queue.offer(new Word(next, cur.count + 1));
                        visited.add(next);
                    }
                }
            }
        }
        return 0;
    }
}