import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        String s = br.readLine();
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == 'A') System.out.print(arr[0]);
            else if (s.charAt(i) == 'B') System.out.print(arr[1]);
            else System.out.print(arr[2]);
            System.out.print(" ");
        }
    }
}
