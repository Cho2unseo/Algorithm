import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str;
        String number = sc.nextLine();
        str = number.split(" ");
        String s = sc.nextLine();
        int cnt = 0;
        for (String string : str) {
            int flag = 0;
            if (s.equals(string)) continue;
            if (string.length() < s.length()) continue;
            for (int j = 0; j < s.length(); j++) {
                if (string.charAt(j) != s.charAt(j)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) cnt++;
        }
        System.out.println(cnt);
    }
}
