#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t, m, n, k;
    string s;
    cin >> t;
    for (int i = 0; i < t; i++) {
        vector <string> v;
        cin >> m;
        for (int j = 0; j < m; j++) {
            cin >> s;
            v.push_back(s);
        }
        cin >> n;
        cout << "Scenario #" << i + 1 << ":\n";
        for (int j = 0; j < n; j++) {
            string ans = "";
            cin >> k;
            for (int l = 0; l < k; l++) {
                int tmp;
                cin >> tmp;
                ans += v[tmp];
            }
            cout << ans << "\n";
        }
        cout << "\n";
    }

    return 0;
}