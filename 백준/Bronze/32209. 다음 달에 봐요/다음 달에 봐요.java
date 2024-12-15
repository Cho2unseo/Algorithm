import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        Stack<Integer> st = new Stack<>();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int com = sc.nextInt();
            if (com == 1) {
                int x = sc.nextInt();
                for (int j = 0; j < x; j++) st.push(0);
            }
            else {
                int y = sc.nextInt();
                if (y > st.size()) flag = 1;
                else {
                    for (int j = 0; j < y; j++) st.pop();
                }
            }
        }
        if (flag == 0) System.out.println("See you next month");
        else System.out.println("Adios");
    }
}
