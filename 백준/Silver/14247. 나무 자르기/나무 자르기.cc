#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int cmp(pair<long long, long long> a, pair<long long, long long>b);

int main() {
    int n, h[100000], a[100000];
    long long cnt = 0;
    vector<pair<long long, long long>> v;
    cin >> n;
    for (int i = 0; i < n; i++) cin >> h[i];
    for (int i = 0; i < n; i++) cin >> a[i];
    for (int i = 0; i < n; i++) v.push_back({h[i], a[i]});
    sort(v.begin(), v.end(), cmp);
    for (int i = 0; i < n; i++) {
        cnt += v[i].first + (v[i].second * i);
    }
    cout << cnt;

    return 0;
}

int cmp(pair<long long, long long> a, pair<long long, long long>b) {
    return a.second < b.second;
}