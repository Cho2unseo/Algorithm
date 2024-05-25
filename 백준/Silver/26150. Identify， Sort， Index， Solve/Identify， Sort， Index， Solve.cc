#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector <pair<char, int>> v;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int id, d;
        string s;
        cin >> s >> id >> d;
        if (s[d - 1] >= 'a' && s[d - 1] <= 'z') s[d - 1] = s[d - 1] + ('A' - 'a');
        v.push_back({s[d - 1], id});
    }
    sort(v.begin(), v.end(), [](const pair<char, int> &a, const pair<char, int> &b) {
        return a.second < b.second;
    });
    for (int i = 0; i < v.size(); i++) cout << v[i].first;

    return 0;
}