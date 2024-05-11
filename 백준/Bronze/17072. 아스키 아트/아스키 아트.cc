#include <iostream>

using namespace std;

int main() {
    int n, m, x[400][1200], r, g, b, f, idx;
    char ch[400][400];
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        idx = 0;
        for (int j = 0; j < m * 3; j++) {
            cin >> x[i][j];
            if (j % 3 == 0) r = x[i][j];
            else if (j % 3 == 1) g = x[i][j];
            else {
                b = x[i][j];
                f = 2126 * r + 7152 * g + 722 * b;
                if (f < 510000) ch[i][idx] = '#';
                else if (f < 1020000) ch[i][idx] = 'o';
                else if (f < 1530000) ch[i][idx] = '+';
                else if (f < 2040000) ch[i][idx] = '-';
                else ch[i][idx] = '.';
                idx++;
            }

        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << ch[i][j];
        }
        cout << "\n";
    }

    return 0;
}