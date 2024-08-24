import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.nextLine();
        String t2 = sc.nextLine();
        String[] time1 = t1.split(":");
        String[] time2 = t2.split(":");
        int h1 = Integer.parseInt(time1[0]), h2 = Integer.parseInt(time2[0]);
        int m1 = Integer.parseInt(time1[1]), m2 = Integer.parseInt(time2[1]);
        int s1 = Integer.parseInt(time1[2]), s2 = Integer.parseInt(time2[2]);
        int n1, n2, n3;
        if (h1 == h2 && m1 == m2 && s1 == s2) {
            n1 = 24;
            n2 = 0;
            n3 = 0;
        }
        else {
            if (s2 < s1) {
                s2 += 60;
                m2--;
            }
            n3 = s2 - s1;
            if (m2 < m1) {
                m2 += 60;
                h2--;
            }
            n2 = m2 - m1;
            if (h2 < h1) h2 += 24;
            n1 = h2 - h1;
        }
        DecimalFormat df = new DecimalFormat("00");
        System.out.println(df.format(n1) + ":" + df.format(n2) + ":" + df.format(n3));
    }
}
