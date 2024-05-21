#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t, n, tmp;
    cin >> t;
    for (int i = 0; i < t; i++) {
        vector <int> x;
        int cnt = 0;
        cin >> n;
        for (int i = 0; i < n; i++) {
            cin >> tmp;
            x.push_back(tmp);
        }
        sort(x.begin(), x.end());
        for (int i = 0; i < n - 1; i++) {
            cnt = cnt + (x[i + 1] - x[i]);
        }
        cout << cnt * 2 << "\n";
    }

    return 0;
}