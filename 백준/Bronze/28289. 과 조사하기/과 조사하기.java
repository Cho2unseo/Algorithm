import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int s = 0;
        int e = 0;
        int a = 0;
        int o = 0;
        for (int i = 0; i < p; i++) {
            int g = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            if (g == 1) o++;
            else {
                if (c == 1 || c == 2) s++;
                else if (c == 3) e++;
                else if (c == 4) a++;
            }
        }
        System.out.println(s);
        System.out.println(e);
        System.out.println(a);
        System.out.println(o);

    }
}
