import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, axis = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x > 0 && y > 0) c1++;
            else if (x < 0 && y > 0) c2++;
            else if (x < 0 && y < 0) c3++;
            else if (x > 0 && y < 0) c4++;
            else axis++;
        }
        System.out.println("Q1: " + c1);
        System.out.println("Q2: " + c2);
        System.out.println("Q3: " + c3);
        System.out.println("Q4: " + c4);
        System.out.println("AXIS: " + axis);
    }
}