#include <iostream>

using namespace std;

int main() {
    int n, m, x[1001][1001], dp[1001][1001];
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) cin >> x[i][j];
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            dp[i][j] = max(dp[i - 1][j], max(dp[i][j - 1], dp[i - 1][j - 1])) + x[i][j];
        }
    }
    cout << dp[n][m];

    return 0;
}