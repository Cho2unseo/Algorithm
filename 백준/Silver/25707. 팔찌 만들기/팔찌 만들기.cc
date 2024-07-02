#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    vector <int> v;
    int n, tmp;
    long long sum = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        v.push_back(tmp);
    }
    sort(v.begin(), v.end(), greater<>());
    for (int i = 0; i < n - 1; i++) {
        sum = sum + (v[i] - v[i + 1]);
    }
    sum = sum + v[0] - v[n - 1];
    cout << sum;

    return 0;
}