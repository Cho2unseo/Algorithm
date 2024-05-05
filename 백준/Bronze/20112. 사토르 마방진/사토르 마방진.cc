#include <iostream>

using namespace std;

int main() {
    int n, flag = 0, k = 0, l = 0, m = 0, o = 0;
    char x[101][101];
    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> x[i][j];
        }
    }
    while (k < n) {
        if (x[k][l] != x[m][o]) {
            flag = 1;
            break;
        }
        l++;
        m++;
        if (l == n) {
            l = 0;
            k++;
            m = 0;
            o++;
        }
    }
    if (flag == 1) cout << "NO";
    else cout << "YES";

    return 0;
}