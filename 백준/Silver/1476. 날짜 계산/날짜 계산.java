import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int ee = 0;
        int ss = 0;
        int mm = 0;
        int res = 0;
        do {
            ee++;
            ss++;
            mm++;
            res++;
            if (ee == 16) ee = 1;
            if (ss == 29) ss = 1;
            if (mm == 20) mm = 1;
        } while (ee != e || ss != s || mm != m);
        System.out.println(res);
    }
}
