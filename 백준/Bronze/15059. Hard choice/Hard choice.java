import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ca = sc.nextInt();
        int ba = sc.nextInt();
        int pa = sc.nextInt();
        int cr = sc.nextInt();
        int br = sc.nextInt();
        int pr = sc.nextInt();
        int sum = 0;
        if (cr - ca > 0) sum += cr - ca;
        if (br - ba > 0) sum += br - ba;
        if (pr - pa > 0) sum += pr - pa;
        System.out.println(sum);
    }
}
