import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Order {
        int table;
        int time;
        Order(int table, int time) {
            this.table = table;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Order> orders = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            if (com.equals("order")) {
                int table = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                orders.add(new Order(table, t));
            }
            else if (com.equals("sort")) {
                orders.sort(new Comparator<Order>() {
                    @Override
                    public int compare(Order o1, Order o2) {
                        if (o1.time == o2.time) return o1.table - o2.table;
                        return o1.time - o2.time;
                    }
                });
            }
            else {
                int table = Integer.parseInt(st.nextToken());
                for (Order o: orders) {
                    if (o.table == table) {
                        orders.remove(o);
                        break;
                    }
                }
            }
            if (orders.isEmpty()) System.out.println("sleep");
            else {
                for (Order o: orders) {
                    System.out.print(o.table + " ");
                }
                System.out.println();
            }
        }
    }
}
