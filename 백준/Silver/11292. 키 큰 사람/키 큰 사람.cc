#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool cmp(pair<string, float> a, pair<string, float> b);

int main() {
    int n;
    float height, max;
    string name;
    while (1) {
        cin >> n;
        vector <pair<string, float>> v;
        if (n == 0) break;
        for (int i = 0; i < n; i++) {
            cin >> name >> height;
            v.push_back({name, height});
        }
        sort(v.begin(), v.end(), cmp);
        max = v[n - 1].second;
        for (int i = 0; i < v.size(); i++) {
            if (v[i].second == max) cout << v[i].first << ' ';
        }
        cout << "\n";
    }

    return 0;
}

bool cmp(pair<string, float> a, pair<string, float> b) {
    return a.second < b.second;
}