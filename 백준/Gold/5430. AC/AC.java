import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            boolean isR = false;
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int error = 0;
            String a = br.readLine();
            a = a.substring(1, a.length() - 1);
            String[] tmp = a.split(",");
            Deque<Integer> deque = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(tmp[j]);
                deque.add(arr[j]);
            }
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == 'R') {
                    isR = !isR;
                }
                else {
                    if (deque.isEmpty()) {
                        System.out.println("error");
                        error = 1;
                        break;
                    }
                    else {
                        if (isR) deque.removeLast();
                        else deque.removeFirst();
                    }
                }
            }
            if (error == 0) {
                System.out.print("[");
                while (!deque.isEmpty()) {
                    if (isR) System.out.print(deque.removeLast());
                    else System.out.print(deque.removeFirst());
                    if (!deque.isEmpty()) System.out.print(",");
                }
                System.out.println("]");
            }
        }
    }
}
