import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int trees = 0;
        TreeMap<String, Integer> tree = new TreeMap<>();
        while ((input = br.readLine()) != null) {
            trees++;
            tree.put(input, tree.getOrDefault(input, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: tree.entrySet()) {
            list.add(entry.getKey());
        }
        for (String iter: list) {
            double per = ((double)tree.get(iter) / trees) * 100;
            String res = String.format("%.4f", per);
            System.out.println(iter + " " + res);
        }

    }
}
