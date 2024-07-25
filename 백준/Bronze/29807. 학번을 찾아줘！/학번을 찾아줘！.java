import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int res = 0, t1 = 0, t2 = 0, t3 = 0;
        int ko = 0, ma = 0, en = 0, et = 0, fo = 0;
        for (int i = 0; i < t; i++) {
            if (sc.hasNextInt()) {
                int tmp = sc.nextInt();
                if (i == 0) ko = tmp;
                if (i == 1) ma = tmp;
                if (i == 2) en = tmp;
                if (i == 3) et = tmp;
                if (i == 4) fo = tmp;
            }
        }
        if (ko > en) t1 = (ko - en) * 508;
        else t1 = (en - ko) * 108;
        if (ma > et) t2 = (ma - et) * 212;
        else t2 = (et - ma) * 305;
        if (fo > 0) t3 = fo * 707;
        res = (t1 + t2 + t3) * 4763;
        System.out.println(res);
    }
}
