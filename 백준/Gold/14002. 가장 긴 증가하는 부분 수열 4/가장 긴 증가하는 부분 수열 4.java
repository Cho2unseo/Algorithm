import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int binary_search(int[] arr, int target, int len) {
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) return mid;
            if (target > arr[mid]) left = mid + 1;
            else right = mid;
        }
        return right;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int[] lis = new int[n + 1];
        lis[0] = arr[0];
        int len = 1;
        int[] index = new int[n + 1];
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < n; i++) {
            if (arr[i] > lis[len - 1]) {
                lis[len] = arr[i];
                index[i] = len;
                len++;
            }
            else {
                int pos = binary_search(lis, arr[i], len);
                lis[pos] = arr[i];
                index[i] = pos;
            }
        }
        System.out.println(len);
        int idx = len - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (index[i] == idx) {
                stack.push(arr[i]);
                idx--;
            }
        }
        while (!stack.empty()) System.out.print(stack.pop() + " ");
    }
}
