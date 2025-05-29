import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        int[] answer = new int[id_list.length];
        Map<String, Integer> count = new HashMap<>();
        Map<String, List<String>> iReportWho = new HashMap<>();
        for (String s: reportSet) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            count.put(to, count.getOrDefault(to, 0) + 1);
            if (!iReportWho.containsKey(from)) {
                iReportWho.put(from, new ArrayList<>());
            }
            iReportWho.get(from).add(to);
        }
        for (int i = 0; i < id_list.length; i++) {
            String s = id_list[i];
            if (iReportWho.containsKey(s)) {
                for (String a: iReportWho.get(s)) {
                    if (count.get(a) >= k) {
                        answer[i]++;
                    }
                }
                
            }  
        }
        return answer;
    }
}