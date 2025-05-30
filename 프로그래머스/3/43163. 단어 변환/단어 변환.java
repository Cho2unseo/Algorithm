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
    
    int diff(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) count++;
        }
        return count;
    }
    
    public int solution(String begin, String target, String[] words) {
        Queue<Word> queue = new ArrayDeque<>();
        Set<String> isVisited = new HashSet<>();
        queue.offer(new Word(begin, 0));
        isVisited.add(begin);
        while (!queue.isEmpty()) {
            Word cur = queue.poll();
            if (cur.word.equals(target)) return cur.count;
            for (String s: words) {
                if (diff(s, cur.word) == 1) {
                    if (!isVisited.contains(s)) {
                        queue.offer(new Word(s, cur.count + 1));
                        isVisited.add(s);
                    }
                }
            }
        }
        return 0;
    }
}