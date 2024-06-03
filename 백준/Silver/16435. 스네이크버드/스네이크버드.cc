#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, l, tmp;
    vector <int> h;
    cin >> n >> l;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        h.push_back(tmp);
    }
    sort(h.begin(), h.end());
    for (int i = 0; i < n; i++) {
        if (h[i] <= l) l++;
        else break;
    }
    cout << l;

    return 0;
}