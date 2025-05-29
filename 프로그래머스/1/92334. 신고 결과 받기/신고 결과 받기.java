import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> set = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, List<String>> reportList = new HashMap<>();
        for (String s: set) {
            String[] str = s.split(" ");
            String to = str[1];
            String from = str[0];
            // System.out.println(reportCount.get(to));
            
            reportCount.put(to, reportCount.getOrDefault(to, 0) + 1);
            if (!reportList.containsKey(from)) {
                reportList.put(from, new ArrayList<>());
            }
            reportList.get(from).add(to);
        }
        for (int i = 0; i < id_list.length; i++) {
            String person = id_list[i];
            for (String p: reportList.getOrDefault(person, new ArrayList<>())) {
                if (reportCount.get(p) >= k) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}