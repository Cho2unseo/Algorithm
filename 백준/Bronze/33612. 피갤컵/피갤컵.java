import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(2024 + " " + 8);
                break;
            case 2:
                System.out.println(2025 + " " + 3);
                break;
            case 3:
                System.out.println(2025 + " " + 10);
                break;
            case 4:
                System.out.println(2026 + " " + 5);
                break;
            case 5:
                System.out.println(2026 + " " + 12);
        }
    }
}
