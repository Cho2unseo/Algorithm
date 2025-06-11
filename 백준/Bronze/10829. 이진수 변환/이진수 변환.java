import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        LinkedList<Integer> list = new LinkedList<>();
        while (n > 0) {
            list.add((int) (n % 2));
            n /= 2;
        }
        Collections.reverse(list);
        for (int a: list) System.out.print(a);
    }
}
