#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    long long sum = 0;
    vector <long long> v;
    int n, k, j = 0;
    cin >> n >> k;
    for (int i = 0; i < n; i++) {
        int tmp;
        cin >> tmp;
        v.push_back(tmp);
    }
    sort(v.begin(), v.end());
    for (int i = 0; i < n; i++) {
        sum += v[i] * j;
        if (j < k) j++;
    }
    cout << sum;

    return 0;
}