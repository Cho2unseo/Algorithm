import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {

    static LinkedList<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = 0;
        for (int i = 1; i <= n; i++) deque.add(i);
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            while (deque.getFirst() != arr[i]) {
                if (deque.indexOf(arr[i]) <= deque.size() / 2) {
                    int tmp = deque.pollFirst();
                    deque.addLast(tmp);
                }
                else {
                    int tmp = deque.pollLast();
                    deque.addFirst(tmp);
                }
                min++;
            }
            if (deque.getFirst() == arr[i]) deque.pollFirst();
        }
        System.out.println(min);
    }
}
