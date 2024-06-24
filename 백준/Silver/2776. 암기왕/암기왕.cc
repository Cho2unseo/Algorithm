#include <iostream>
#include <set>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int t, n, m, tmp;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> n;
        set<int> s1, s2;
        for (int j = 0; j < n; j++) {
            cin >> tmp;
            s1.insert(tmp);
        }
        cin >> m;
        for (int j = 0; j < m; j++) {
            cin >> tmp;
            if (s1.find(tmp) != s1.end()) cout << "1\n";
            else cout << "0\n";
        }
    }

    return 0;
}