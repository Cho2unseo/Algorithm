#include <iostream>

using namespace std;

int main() {
    int n, g = 0, s = 0, i, j, flag;
    char x[100][100];
    cin >> n;
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            cin >> x[i][j];
        }
    }
    for (i = 0; i < n; i++) {
        flag = 0;
        for (j = 0; j < n - 1; j++) {
            if (flag == 0) {
                if (x[i][j] == '.' && x[i][j + 1] == '.') {
                    g++;
                    flag = 1;
                }
            }
            if (x[i][j] == 'X') flag = 0;
        }
    }
    for (i = 0; i < n; i++) {
        flag = 0;
        for (j = 0; j < n - 1; j++) {
            if (flag == 0) {
                if (x[j][i] == '.' && x[j + 1][i] == '.') {
                    s++;
                    flag = 1;
                }
            }
            if (x[j][i] == 'X') flag = 0;
        }
    }
    cout << g << ' ' << s;

    return 0;
}