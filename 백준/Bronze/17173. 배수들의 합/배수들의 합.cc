#include <iostream>

using namespace std;

int main() {
    int n, m, k[1000], res = 0;
    cin >> n >> m;
    for (int i = 0; i < m; i++) cin >> k[i];
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < m; j++) {
            if (i % k[j] == 0) {
                res += i;
                break;
            }
        }
    }
    cout << res;

    return 0;
}