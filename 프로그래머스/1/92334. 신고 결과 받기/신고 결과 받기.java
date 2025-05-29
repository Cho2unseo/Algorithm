import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>(Arrays.asList(report));
        Map<String, List<String>> reportMap = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();
        for (String s: set) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            reportCount.put(to, reportCount.getOrDefault(to, 0) + 1);
            if (!reportMap.containsKey(from)) {
                reportMap.put(from, reportMap.getOrDefault(from, new ArrayList<>()));
            }
            reportMap.get(from).add(to);   
        }
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            if (reportMap.containsKey(name)) {
                                    // System.out.println("신고자" + name);

                for (String user: reportMap.get(name)) {
                    // System.out.println(user);
                    if (reportCount.get(user) >= k) answer[i]++;
                }
            }
        }
        return answer;
    }
}