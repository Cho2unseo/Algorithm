#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    vector<pair<char, int>> m;
    string s;
    cin >> s;
    int num = 0, cnt = 0;
    char ch;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] >= '0' && s[i] <= '9') {
            num = num * 10 + s[i] - '0';
        }
        else {
            ch = s[i];
            num = 0;
        }
        if (i % 3 == 2 || i == s.length() - 1) {
            if (num > 0) {
                for (auto p : m) {
                    if (p.first == ch && p.second == num) {
                        cout << "GRESKA";
                        return 0;
                    }
                }
                m.push_back({ch, num});
            }
            num = 0;
        }
    }
    for (auto a : m) {
        if (a.first == 'P') cnt++;
    }
    cout << 13 - cnt << ' ';
    cnt = 0;
    for (auto b : m) {
        if (b.first == 'K') cnt++;
    }
    cout << 13 - cnt << ' ';
    cnt = 0;
    for (auto c : m) {
        if (c.first == 'H') cnt++;
    }
    cout << 13 - cnt << ' ';
    cnt = 0;
    for (auto d : m) {
        if (d.first == 'T') cnt++;
    }
    cout << 13 - cnt << ' ';

    return 0;
}