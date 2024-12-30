import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("social") || s.contains("history") || s.contains("language") || s.contains("literacy")) System.out.println("digital humanities");
        else System.out.println("public bigdata");
    }
}