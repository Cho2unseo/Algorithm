#include <iostream>

using namespace std;

int main() {
    int n, m, r, c, d, x[50][50], cnt = 0;
    cin >> n >> m >> r >> c >> d;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> x[i][j];
        }
    }
    while (1) {
        if (r < 0 || c < 0 || r >= n || c >= m) break;
        if (x[r][c] == 0) {
            cnt++;
            x[r][c] = 2;
        }
        if (r - 1 < 0 || c - 1 < 0 || r + 1 >= n || c + 1 >= m) break;
        for (int i = 0; i < 4; i++) {
            d = (d + 3) % 4;
            if (d == 0) {
                if (x[r - 1][c] == 0) {
                    r--;
                    break;
                }
            }
            else if (d == 1) {
                if (x[r][c + 1] == 0) {
                    c++;
                    break;
                }
            }
            else if (d == 2) {
                if (x[r + 1][c] == 0) {
                    r++;
                    break;
                }
            }
            else if (d == 3) {
                if (x[r][c - 1] == 0) {
                    c--;
                    break;
                }
            }
            if (i == 3) {
                if (d == 0) {
                    if (x[r + 1][c] != 1) {
                        r++;
                        break;
                    }
                }
                else if (d == 1) {
                    if (x[r][c - 1] != 1) {
                        c--;
                        break;
                    }
                }
                else if (d == 2) {
                    if (x[r - 1][c] != 1) {
                        r--;
                        break;
                    }
                }
                else if (d == 3) {
                    if (x[r][c + 1] != 1) {
                        c++;
                        break;
                    }
                }
                cout << cnt;
                return 0;
            }
        }
    }

    return 0;
}