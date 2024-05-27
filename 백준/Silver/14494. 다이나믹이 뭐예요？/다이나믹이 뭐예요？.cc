#include <iostream>
using namespace std;

long long x[1001][1001];

int main() {
    int n, m;
    cin >> n >> m;
    x[1][1] = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (i == 1 || j == 1) x[i][j] = 1;
            else x[i][j] = (x[i][j - 1] + x[i - 1][j] + x[i - 1][j - 1]) % 1000000007;
        }
    }
    cout << x[n][m];

    return 0;
}