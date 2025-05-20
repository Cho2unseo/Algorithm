import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) n[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 8; i++) {
            if (n[i] != 0 && n[i] != 1) {
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}
