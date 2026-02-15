import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Student {
        int t;
        int s;
        int n;

        Student(int t, int s, int n) {
            this.t = t;
            this.s = s;
            this.n = n;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            list.add(new Student(t, s, n));
        }
        list.sort((o1, o2) -> o1.t - o2.t);
        int[] seat = new int[c + 1];
        int[] student = new int[x + 1];
        for (Student a: list) {
            if (seat[a.s] == 0) {
                if (student[a.n] != 0) seat[student[a.n]] = 0;
                seat[a.s] = a.n;
                student[a.n] = a.s;
            }
        }
        for (int i = 1; i <= x; i++) {
            if (student[i] > 0) System.out.println(i + " " + student[i]);
        }
    }
}
