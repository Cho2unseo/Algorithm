import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static class Student {
        int c;
        int s;
        int score;

        public Student(int c, int s, int score) {
            this.c = c;
            this.s = s;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Student> students = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            students.add(new Student(a, b, c));
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.score - o1.score;
            }
        });
        int a = 0;
        int flag = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 3) break;
            if (a == 0) {
                System.out.println(students.get(i).c + " " + students.get(i).s);
                cnt++;
                a = students.get(i).c;
                flag = 1;
            }
            else {
                if (flag == 1) {
                    System.out.println(students.get(i).c + " " + students.get(i).s);
                    cnt++;
                    if (a == students.get(i).c) flag++;
                }
                else {
                    if (a == students.get(i).c) continue;
                    System.out.println(students.get(i).c + " " + students.get(i).s);
                    cnt++;
                }
            }
        }
    }
}
