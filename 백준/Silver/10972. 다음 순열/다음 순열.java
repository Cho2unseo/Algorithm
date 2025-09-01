import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean np(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) --i;
        if (i == 0) return false;
        int j = arr.length - 1;
        while (arr[i - 1] >= arr[j]) --j;
        swap(arr, i - 1, j);
        int k = arr.length - 1;
        while (i < k) swap(arr, i++, k--);

        return true;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        if (!np(arr)) System.out.println(-1);
        else {
            for (int a: arr) System.out.print(a + " ");
        }
    }
}
