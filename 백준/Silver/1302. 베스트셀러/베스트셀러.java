import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    static class book {
        int cnt;
        String name;

        public book(int cnt, String name) {
            this.cnt = cnt;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<book> books = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int flag = 0;
            for (book b: books) {
                if (s.equals(b.name)) {
                    b.cnt++;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) books.offer(new book(1, s));
        }
        books.sort(new Comparator<book>() {
            @Override
            public int compare(book o1, book o2) {
                if (o1.cnt == o2.cnt) {
                    return o1.name.compareTo(o2.name);
                }
                return o2.cnt - o1.cnt;
            }
        });
       System.out.println(books.getFirst().name);
    }
}
