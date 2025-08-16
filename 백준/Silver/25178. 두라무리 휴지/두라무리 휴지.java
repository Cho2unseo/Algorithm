import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();
        if ((a.charAt(0) != b.charAt(0)) || (a.charAt(n - 1) != b.charAt(n - 1))) {
            System.out.println("NO");
            return;
        }
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        int[] aa = new int[26];
        int[] bb = new int[26];
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' && a.charAt(i) != 'o' && a.charAt(i) != 'u') sba.append(a.charAt(i));
            if (b.charAt(i) != 'a' && b.charAt(i) != 'e' && b.charAt(i) != 'i' && b.charAt(i) != 'o' && b.charAt(i) != 'u') sbb.append(b.charAt(i));
            aa[a.charAt(i) - 'a']++;
            bb[b.charAt(i) - 'a']++;
        }
        if (!sba.toString().contentEquals(sbb)) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (aa[i] != bb[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
