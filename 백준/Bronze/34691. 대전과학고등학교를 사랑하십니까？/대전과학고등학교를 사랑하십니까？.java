import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("end")) break;
            if (s.equals("animal")) System.out.println("Panthera tigris");
            else if (s.equals("flower")) System.out.println("Forsythia koreana");
            else System.out.println("Pinus densiflora");
        }
    }
}
