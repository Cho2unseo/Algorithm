import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Student[] students = new Student[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String jaehak = st.nextToken();
            String winner = st.nextToken();
            int best = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            if (jaehak.equals("hewhak")) continue;
            if (winner.equals("winner")) continue;
            if (best >= 1 && best <= 3) continue;
            students[idx++] = new Student(name, grade);
        }
        students = Arrays.copyOf(students, idx);
        // for (int i = 0; i < idx; i++) System.out.println(students[i].name + " " + students[i].grade);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.grade - o2.grade;
            }
        });
        if (idx >= 10) {
            idx = 10;
            students = Arrays.copyOf(students, idx);
        }
        System.out.println(idx);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (int i = 0; i < idx; i++) System.out.println(students[i].name);
    }
}