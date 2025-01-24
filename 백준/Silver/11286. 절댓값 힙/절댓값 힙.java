import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) return o1 - o2;
                return Math.abs(o1) - Math.abs(o2);
            }
        });
        for (int i = 0; i < n; i++) {
            int com = Integer.parseInt(br.readLine());
            if (com == 0) {
                if (priorityQueue.isEmpty()) System.out.println(0);
                else System.out.println(priorityQueue.poll());
            }
            else {
                priorityQueue.offer(com);
            }
        }
    }
}
