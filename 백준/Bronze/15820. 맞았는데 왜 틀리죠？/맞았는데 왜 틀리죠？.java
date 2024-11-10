import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < s1; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (c != d) {
                flag = 1;
                break;
            }
        }
        for (int i = 0; i < s2; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (flag == 0) {
                if (c != d) {
                    flag = 2;
                    break;
                }
            }
        }
        if (flag == 0) System.out.println("Accepted");
        else if (flag == 1) System.out.println("Wrong Answer");
        else System.out.println("Why Wrong!!!");
    }
}
