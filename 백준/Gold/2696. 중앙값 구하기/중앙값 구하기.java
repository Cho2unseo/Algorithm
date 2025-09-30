import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int m = Integer.parseInt(br.readLine());
            List<Integer> list = new LinkedList<>();
            int count = 0;
            PriorityQueue<Integer> tmp1 = new PriorityQueue<>();
            PriorityQueue<Integer> tmp2 = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            while (count < m) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    int n = Integer.parseInt(st.nextToken());
                    if (tmp1.size() == tmp2.size()) tmp2.add(n);
                    else tmp1.add(n);
                    if (!tmp1.isEmpty()) {
                        if (tmp1.peek() < tmp2.peek()) {
                            int t1 = tmp1.poll();
                            int t2 = tmp2.poll();
                            tmp1.add(t2);
                            tmp2.add(t1);
                        }
                    }
                    if (count % 2 == 0) list.add(tmp2.peek());
                    count++;
                    if (count == m) break;
                }
            }
            System.out.println(list.size());
            int cnt = 0;
            for (int a: list) {
                System.out.print(a + " ");
                cnt++;
                if (cnt % 10 == 0) System.out.println();
            }
            System.out.println();
        }
    }
}
