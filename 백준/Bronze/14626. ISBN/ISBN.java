import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x = new char[13];
        int[] isbnweight = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1};
        int ck = 0;
        int ckidx = 0;
        String isbn = sc.nextLine();
        for (int i = 0; i < 13; i++) {
            x[i] = isbn.charAt(i);
        }
        for (int i = 0; i < 13; i++) {
            if (x[i] != '*') {
                ck += isbnweight[i] * (x[i] - '0');
            }
            else ckidx = i;
        }
        for (int i = 0; i < 10; i++) {
            if ((ck + (i * isbnweight[ckidx])) % 10 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
