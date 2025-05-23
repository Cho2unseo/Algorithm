import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String step1 = new_id.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < step1.length(); i++) {
            if ((step1.charAt(i) >= 'a' && step1.charAt(i) <= 'z') || (step1.charAt(i) >= '0' && step1.charAt(i) <= '9') || step1.charAt(i) == '-' || step1.charAt(i) == '_' || step1.charAt(i) == '.') sb.append(step1.charAt(i));
        }
        String step2 = sb.toString();
        sb = new StringBuilder();
        for (int i = 0; i < step2.length(); i++) {
            if (step2.charAt(i) == '.') {
                if (i != 0) {
                    if (i == step2.length() - 1) continue;
                    if (step2.charAt(i) != step2.charAt(i - 1)) sb.append(".");
                }
            }
            else sb.append(step2.charAt(i));
        }
        String step4 = sb.toString();
        if (step4.length() == 0) step4 = "a";
        if (step4.length() >= 16) {
            step4 = step4.substring(0, 15);
            if (step4.charAt(14) == '.') step4 = step4.substring(0, 14);
        }
        char a = step4.charAt(step4.length() - 1);
        if (a == '.') {
            step4 = step4.substring(0, step4.length() - 1);
            a = step4.charAt(step4.length() - 1);
        }
        while (step4.length() < 3) {
            step4 += a;
        }
        return step4;
    }
}