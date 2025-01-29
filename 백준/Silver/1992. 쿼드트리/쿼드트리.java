import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static char[][] arr;

    static char check(int x, int y, int size) {
        char first = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (first != arr[i][j]) return '2';
            }
        }
        return first;
    }

    static void divide(int x, int y, int size) {
        char ret = check(x, y, size);
        if (ret == '2') {
            size = size / 2;
            System.out.print("(");
            divide(x, y, size);
            divide(x, y + size, size);
            divide(x + size, y, size);
            divide(x + size, y + size, size);
            System.out.print(")");
        }
        else System.out.print(ret);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = s.toCharArray();
        }
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(arr[i][j] + " ");
            System.out.println();
        }
         */
        divide(0, 0, n);
    }
}
