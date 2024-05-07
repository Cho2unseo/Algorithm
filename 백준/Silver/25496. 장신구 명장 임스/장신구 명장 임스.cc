#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int p, n, cnt = 0;
    vector <int> a;
    cin >> p >> n;
    for (int i = 0; i < n; i++) {
        int tmp;
        cin >> tmp;
        a.push_back(tmp);
    }
    sort(a.begin(), a.end());
    for (auto it : a) {
        if (p < 200) cnt++;
        p += it;
    }
    cout << cnt;

    return 0;
}