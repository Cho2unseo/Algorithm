#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n, x[200001], dp[200000] = {0}, minn;
    cin >> n;
    for (int i = 0; i < n; i++) cin >> x[i];
    minn = x[0];
    for (int i = 1; i < n; i++) {
        dp[i] = max(dp[i - 1], x[i] - minn);
        minn = min(minn, x[i]);
    }
    for (int i = 0; i < n; i++) cout << dp[i] << ' ';

    return 0;
}