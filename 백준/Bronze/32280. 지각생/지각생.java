import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new LinkedList<>();
        int teacher = 0;
        for (int i = 0; i < n + 1; i++) {
            String s = br.readLine();
            if (s.contains("teacher")) {
                String[] arr = s.split(" ");
                String[] str = arr[0].split(":");
                teacher = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
            }
            list.add(s);
        }
        int cnt = 0;
        String s = br.readLine();
        String[] arr = s.split(":");
        int time = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
        for (String a: list) {
            arr = a.split(" ");
            if (arr[1].equals("teacher")) continue;
            String[] str = arr[0].split(":");
            int t = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
            if (t >= time && t >= teacher) cnt++;
        }
        System.out.println(cnt);
    }
}
