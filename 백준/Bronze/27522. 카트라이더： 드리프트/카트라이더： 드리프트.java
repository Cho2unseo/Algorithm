import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    static class Time {
        int m;
        int ss;
        int sss;
        String team;

        Time(int m, int ss, int sss, String team) {
            this.m = m;
            this.ss = ss;
            this.sss = sss;
            this.team = team;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = 0;
        int b = 0;
        LinkedList<Time> times = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            String[] tt = arr[0].split(":");
            times.add(new Time(Integer.parseInt(tt[0]), Integer.parseInt(tt[1]), Integer.parseInt(tt[2]), arr[1]));
        }
        times.sort(new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.m == o2.m) {
                    if (o1.ss == o2.ss) {
                        return o1.sss - o2.sss;
                    }
                    return o1.ss - o2.ss;
                }
                return o1.m - o2.m;
            }
        });
        int[] score = {10, 8, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < 8; i++) {
            if (times.get(i).team.equals("R")) r += score[i];
            else b += score[i];
        }
        System.out.println(r > b ? "Red" : "Blue");
    }
}
