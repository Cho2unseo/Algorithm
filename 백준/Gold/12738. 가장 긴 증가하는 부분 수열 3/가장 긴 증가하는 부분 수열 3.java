import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int binary_search(int[] arr, int target, int len) {
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid;
        }
        return right;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] lis = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        lis[0] = arr[0];
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (lis[len - 1] < arr[i]) {
                lis[len] = arr[i];
                len++;
            }
            else {
                int pos = binary_search(lis, arr[i], len);
                lis[pos] = arr[i];
            }
        }
        System.out.println(len);
    }
}
