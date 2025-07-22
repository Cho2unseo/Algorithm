import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re = 1000 - n;
        int sum = 0;
        while (re > 0) {
            if (re / 500 > 0) {
                sum += re / 500;
                re = re % 500;
            }
            else if (re / 100 > 0) {
                sum += re / 100;
                re = re % 100;
            }
            else if (re / 50 > 0) {
                sum += re / 50;
                re = re % 50;
            }
            else if (re / 10 > 0) {
                sum += re / 10;
                re = re % 10;
            }
            else if (re / 5 > 0) {
                sum += re / 5;
                re = re % 5;
            }
            else {
                sum += re;
                re = 0;
            }
        }
        System.out.println(sum);
    }
}
