import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> set = new HashSet<>(Arrays.asList(report));
        Map<String, List<String>> iReportWho = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();
        for (String s: set) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            reportCount.put(to, reportCount.getOrDefault(to, 0) + 1);
            if (!iReportWho.containsKey(from)) {
                iReportWho.put(from, iReportWho.getOrDefault(from, new ArrayList<>()));
            }
            iReportWho.get(from).add(to);
        }
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            if (iReportWho.containsKey(name)) {
                for (String user: iReportWho.get(name)) {
                    // System.out.println(user);
                    if (reportCount.get(user) >= k) answer[i]++;
                }
            }
        }
        return answer;
    }
}