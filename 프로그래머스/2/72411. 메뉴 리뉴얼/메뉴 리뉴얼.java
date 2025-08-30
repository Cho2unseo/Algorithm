import java.util.*;

class Solution {
    char[] src;
    int srcLength;
    StringBuilder sb = new StringBuilder(); // tgt 역할
    int tgtLength;

    // 2개, 3개 단품메뉴 문자열의 빈도수를 관리
    // "AB" - 3, "CD" - 2
    HashMap<String, Integer> map = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>(); // 2개짜리, 3개짜리... 모두 들어감

        // 코스요리 개수만큼
        for (int i = 0; i < course.length; i++) {
            // 초기화
            // 코스요리의 메뉴 개수가 달라지면 이전 개수를 위해 담긴 항목들 정리
            map.clear();
            tgtLength = course[i]; // 코스 요리를 구성하는 단품 메뉴들의 수

            // 각 손님들이 주문한 단품메뉴들 각각 (src)
            for (int j = 0; j < orders.length; j++) {
                src = orders[j].toCharArray();
                Arrays.sort(src); // 문제에서 제시한 조합의 알파벳 정렬

                // 조합
                // 초기화
                srcLength = src.length;
                sb.setLength(0); // StringBuilder 초기화

                // 코스 안의 요리 개수보다 주문한 양이 적으면 체크할 필요 X
                if (tgtLength <= srcLength) comb(0, 0);
            }

           // map에서 빈도수가 가장 큰 문자열
           if (!map.isEmpty()) {
               int max = Collections.max(map.values()); // 가장 큰 빈도수
               if (max > 1) {
                   for (String key: map.keySet()) {
                       if (max == map.get(key)) {
                           answer.add(key);
                           // 동일한 value가 여러개 있을 수 있기 때문에 여기서 break; 하면 안 됨
                       }
                   }
               }
           }
        }

        Collections.sort(answer); // 사전순으로 정렬
        
        return answer.toArray(new String[0]); // 길이가 0인 String 배열 전달 -> 변환
    }

    public void comb(int srcIdx, int tgtIdx) {
        // 기저 조건
        if (tgtIdx == tgtLength) {
            // complete code
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            return;
        }
        if (srcIdx == srcLength) return; // src 끝남

        // 선택
        sb.append(src[srcIdx]);
        comb(srcIdx + 1, tgtIdx + 1);
        // 비선택
        sb.setLength(sb.length() - 1); // 추가해둔 거 다시 하나 없애기
        comb(srcIdx + 1, tgtIdx);
    }
}