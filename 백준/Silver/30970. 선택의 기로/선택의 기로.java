import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(bf.readLine());
        int[][] p = new int[t][2];
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            p[i][0] = Integer.parseInt(st.nextToken()); // 품질
            p[i][1] = Integer.parseInt(st.nextToken()); // 가격
        }
        Arrays.sort(p, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) return Integer.compare(o2[0], o1[0]);
                else return Integer.compare(o1[1], o2[1]);
            }
        });
        int[] first = {p[0][0], p[0][1], p[1][0], p[1][1]};
        Arrays.sort(p, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) return Integer.compare(o1[1], o2[1]);
                else return Integer.compare(o2[0], o1[0]);
            }
        });
        int[] second = {p[0][0], p[0][1], p[1][0], p[1][1]};

        System.out.println(Arrays.toString(first).replaceAll("[\\[,\\]]", ""));
        System.out.println(Arrays.toString(second).replaceAll("[\\[,\\]]", ""));
    }
}
