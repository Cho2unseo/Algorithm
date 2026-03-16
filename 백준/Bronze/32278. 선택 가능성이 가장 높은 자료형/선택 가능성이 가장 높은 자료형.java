import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n <= Math.pow(2, 15) - 1 && n >= -Math.pow(2, 15)) System.out.println("short");
        else if (n <= Math.pow(2, 31) - 1 && n >= -Math.pow(2, 31)) System.out.println("int");
        else System.out.println("long long");
    }
}
