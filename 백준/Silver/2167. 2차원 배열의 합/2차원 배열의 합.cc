#include <iostream>

using namespace std;

int main() {
    long long cnt = 0;
    int n, m, arr[300][300], i, j, x, y, k;
    cin >> n >> m;
    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }
    cin >> k;
    for (int a = 0; a < k; a++) {
        cin >> i >> j >> x >> y;
        cnt = 0;
        for (int b = i - 1; b < x; b++) {
            for (int c = j - 1; c < y; c++) cnt += arr[b][c];
        }
        cout << cnt << "\n";

    }

    return 0;
}