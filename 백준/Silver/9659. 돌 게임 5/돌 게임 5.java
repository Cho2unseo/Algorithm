import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n % 2 == 1) System.out.println("SK");
        else System.out.println("CY");
    }
}

/*
n = 1 -> SK
n = 2 -> CY
n = 3 -> SK
n = 4 -> SK or CY
n = 5 -> 1 3 1 SK 1 1 1 1 1 SK
n = 6 -> 1 1 1 1 1 1 CY 3 3 CY 3 1 1 1 CY 1 3 1 1 CY
n = 7 -> 1 3 3 SK 1 1 1 1 1 1 1 SK 3 1 1 1 1 SK 3 1 1 1 1 SK
n = 8 -> 3 3 1 1 CY 1 1 1 1 1 1 1 1 CY 1 3 1 1 1 1 CY
n = 9 -> 3 3 3 SK

 */