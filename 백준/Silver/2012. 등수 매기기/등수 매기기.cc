#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, tmp;
    long long sum = 0;
    vector <int> v;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        v.push_back(tmp);
    }
    sort(v.begin(), v.end());
    for (int i = 0; i < v.size(); i++) {
        sum = sum + (abs(v[i] - (i + 1)));
    }
    cout << sum;

    return 0;
}