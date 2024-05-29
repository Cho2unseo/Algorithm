#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector <int> v;
    int n, l, up = 0, sum = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> l;
        v.push_back(l);
    }
    sort(v.begin(), v.end(), greater<>());
    for (int i = 0; i < 42 && i < v.size(); i++) {
        l = v[i];
        if (l >= 250) up += 5;
        else if (l >= 200) up += 4;
        else if (l >= 140) up += 3;
        else if (l >= 100) up += 2;
        else if (l >= 60) up += 1;
        sum += l;
    }
    cout << sum << ' ' << up;

    return 0;
}