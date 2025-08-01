import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("A")) {
            s = s.replace("B", "A");
            s = s.replace("C", "A");
            s = s.replace("D", "A");
            s = s.replace("F", "A");
        }
        else if (s.contains("B")) {
            s = s.replace("C", "B");
            s = s.replace("D", "B");
            s = s.replace("F", "B");
        }
        else if (s.contains("C")) {
            s = s.replace("D", "C");
            s = s.replace("F", "C");
        }
        else {
            String a = "";
            for (int i = 0; i < s.length(); i++) a += 'A';
            s = a;
        }
        System.out.println(s);
    }
}
