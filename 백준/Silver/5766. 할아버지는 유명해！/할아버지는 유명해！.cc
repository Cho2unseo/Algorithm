#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n, m, tmp;
    while (1) {
        cin >> n >> m;
        if (n == 0 && m == 0) break;
        int x[10001] = {0}, maxn = 0, res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> tmp;
                x[tmp]++;
            }
        }
        for (int i = 0; i < 10001; i++) {
            maxn = max(maxn, x[i]);
        }
        for (int i = 0; i < 10001; i++) {
            if (res < maxn) {
                if (res < x[i] && x[i] < maxn) res = x[i];
            }
        }
        for (int i = 0; i < 10001; i++) {
            if (x[i] == res) cout << i << ' ';
        }            
        cout << "\n";
    }

    return 0;
}