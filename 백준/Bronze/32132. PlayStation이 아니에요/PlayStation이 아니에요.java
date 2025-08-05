import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        while (s.contains("PS4") || s.contains("PS5")) {
            s = s.replace("PS4", "PS");
            s = s.replace("PS5", "PS");
        }
        System.out.println(s);
    }
}
