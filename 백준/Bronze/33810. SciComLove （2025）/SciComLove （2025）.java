import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ori = "SciComLove".toCharArray();
        char[] arr = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (ori[i] != arr[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
