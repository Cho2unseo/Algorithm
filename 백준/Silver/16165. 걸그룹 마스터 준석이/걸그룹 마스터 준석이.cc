#include <iostream>
#include <map>
#include <algorithm>
#include <vector>

using namespace std;

bool cmp(pair<string, string> &a, pair<string, string> &b);

int main() {
    int n, m, num, q;
    string name, member, quiz;
    map <string, string> group;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> name >> num;
        for (int j = 0; j < num; j++) {
            cin >> member;
            group.insert({member, name});
        }
    }
    vector <pair<string, string>> vec(group.begin(), group.end());
    sort(vec.begin(), vec.end(), cmp);
    for (int i = 0; i < m; i++) {
        cin >> quiz;
        cin >> q;
        if (q == 0) {
            for (auto j: vec) {
                if (j.second == quiz) {
                    cout << j.first << "\n";
                } 
            }
        }
        else {
            for (auto j: vec) {
                if (j.first == quiz) {
                    cout << j.second << "\n";
                    break;
                }
            }
        }
    }

    return 0;
}

bool cmp(pair<string, string> &a, pair<string, string> &b) {
    if (a.second == b.second) return a.first < b.first;
    return a.second < b.second;
}