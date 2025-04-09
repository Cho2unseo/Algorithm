import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean check_row(int[][] arr) {
        for (int i = 0; i < 9; i++) {
            boolean[] is = new boolean[11];
            for (int j = 0; j < 9; j++) {
                if (is[arr[i][j]]) return false;
                is[arr[i][j]] = true;
            }
        }
        return true;
    }

    static boolean check_col(int[][] arr) {
        for (int i = 0; i < 9; i++) {
            boolean[] is = new boolean[11];
            for (int j = 0; j < 9; j++) {
                if (is[arr[j][i]]) return false;
                is[arr[j][i]] = true;
            }
        }
        return true;
    }

    static boolean box(int[][] arr) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean[] is = new boolean[11];
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (is[arr[k][l]]) return false;
                        is[arr[k][l]] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[][] arr = new int[9][9];
            for (int j = 0; j < 9; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 9; k++) arr[j][k] = Integer.parseInt(st.nextToken());
            }
//            for (int j = 0; j < 9; j++) {
//                for (int k = 0; k < 9; k++) {
//                    System.out.print(arr[j][k] + " ");
//                }
//                System.out.println();
//            }
            System.out.print("Case " + (i + 1) + ": ");
            if (check_col(arr) && check_row(arr) && box(arr)) System.out.println("CORRECT");
            else System.out.println("INCORRECT");
            if (i < t - 1) br.readLine();
        }
    }
}
