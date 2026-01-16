import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int aa = sc.nextInt();
        int b = sc.nextInt();
        int bb = sc.nextInt();
        while (aa > 0 || bb > 0) {
            aa -= b;
            bb -= a;
            if (aa <= 0 || bb <= 0) break;
        }
        if (aa <= 0 && bb <= 0) System.out.println("DRAW");
        else if (aa <= 0) System.out.println("PLAYER B");
        else System.out.println("PLAYER A");
    }
}
