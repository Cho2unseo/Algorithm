import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("R0C0")) break;
            String[] st = s.split("[RC]");
            int r = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);
            StringBuilder sb = new StringBuilder();
            while (c > 0) {
                c--;
                char ns = (char) (c % 26 + 'A');
                sb.append(ns);
                c = c / 26;
            }
            sb.reverse().append(r);
            System.out.println(sb);
        }
    }
}
