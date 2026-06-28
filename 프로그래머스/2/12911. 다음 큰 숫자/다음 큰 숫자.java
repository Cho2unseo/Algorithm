class Solution {
    public int solution(int n) {
        int cnt = 0;
        String org = Integer.toBinaryString(n);
        for (int i = 0; i < org.length(); i++) {
            if (org.charAt(i) == '1') cnt++;
        }
        while (true) {
            n++;
            int c = 0;
            String cmp = Integer.toBinaryString(n);
            for (int i = 0; i < cmp.length(); i++) {
                if (cmp.charAt(i) == '1') c++;
            }
            if (c == cnt) break;
        }
        return n;
    }
}