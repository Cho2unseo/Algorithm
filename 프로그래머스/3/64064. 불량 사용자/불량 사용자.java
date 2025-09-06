import java.util.*;

class Solution {

        String[] userIds;
        String[] bannedIds;
        HashSet<HashSet<String>> result = new HashSet<>();
        
        public int solution(String[] user_id, String[] banned_id) {
            userIds = user_id;
            bannedIds = banned_id;

            // 풀이
            dfs(0, new HashSet<>());

            return result.size();
        }

        void dfs(int bannedIdIdx, HashSet<String> set) {
            // 기저 조건
            if (bannedIdIdx == bannedIds.length) {
                // complete code
                result.add(set);
                return;
            }

            // 모든 user_id에 대해서 현재 bannedIdIdx의 제제 아이디와 일치를 따진다.
            for (int i = 0; i < userIds.length; i++) {
                if (set.contains(userIds[i])) continue; // 이전 단계에서 다른 bannedId에 의해 이미 선택된 경우
                // 매칭 여부 확인
                if (check(userIds[i], bannedIds[bannedIdIdx])) {
                    set.add(userIds[i]);
                    dfs(bannedIdIdx + 1, new HashSet<>(set)); // set을 포함한 새로운 HashSet
                    set.remove(userIds[i]); // 다음 userId를 따질 것이므로 다시 제거 (원복)
                }
            }
        }

        boolean check(String userId, String bannedId) {
            // 길이 체크
            if (userId.length() != bannedId.length()) return false;
            for (int i = 0; i < userId.length(); i++) {
                if (bannedId.charAt(i) != '*' && userId.charAt(i) != bannedId.charAt(i)) return false;
            }
            return true;
        }
    }