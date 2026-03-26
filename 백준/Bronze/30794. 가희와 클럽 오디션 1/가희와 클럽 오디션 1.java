import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lv = sc.nextInt();
        String s = sc.next();
        int res = 0;
        switch (s) {
            case "bad":
                res = lv * 200;
                break;
            case "cool":
                res = lv * 400;
                break;
            case "great":
                res = lv * 600;
                break;
            case "perfect":
                res = lv * 1000;
                break;
        }
        System.out.println(res);
    }
}
