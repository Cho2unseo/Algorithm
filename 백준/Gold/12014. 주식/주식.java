import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    static int binary_search(int[] arr, int target, int len) {
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else {
                if (arr[mid] < target) left = mid + 1;
                else right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n + 1];
            int[] lis = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
            lis[0] = arr[0];
            int len = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] > lis[len - 1]) {
                    lis[len] = arr[i];
                    len++;

                }
                else {
                    int pos = binary_search(lis, arr[i], len);
                    lis[pos] = arr[i];
                }
            }
            System.out.println("Case #" + test_case);
            if (len >= k) System.out.println(1);
            else System.out.println(0);
        }
    }
}

