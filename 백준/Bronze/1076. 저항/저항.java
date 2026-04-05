import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("black", "0");
        map.put("brown", "1");
        map.put("red", "2");
        map.put("orange", "3");
        map.put("yellow", "4");
        map.put("green", "5");
        map.put("blue", "6");
        map.put("violet", "7");
        map.put("grey", "8");
        map.put("white", "9");
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String sum = map.get(a) + map.get(b);
        System.out.println(Long.parseLong(sum) * (long) Math.pow(10, Integer.parseInt(map.get(c))));
    }
}
