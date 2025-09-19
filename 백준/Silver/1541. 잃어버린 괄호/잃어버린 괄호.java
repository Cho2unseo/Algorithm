import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split("-");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            String[] nums = arr[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < nums.length; j++) sum += Integer.parseInt(nums[j]);
            if (i == 0) min = sum;
            else min -= sum;
        }
        System.out.println(min);
    }
}
