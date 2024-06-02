#include <iostream>

using namespace std;

int main() {
    int n, m;
    char a[10][10], b[20][20], c;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> a[i][j];
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 2 * m; j++) {
            cin >> b[i][j];
        }
    }
    for (int i = 0; i < n; i++) {
        for (int k = 0, l = 0; k < m; k++) {
            if (a[i][k] != b[i][l] || a[i][k] != b[i][l + 1]) {
                cout << "Not Eyfa";
                return 0;
            }
            l += 2;
        }
    }
    cout << "Eyfa";

    return 0;
}