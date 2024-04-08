#include <iostream>

using namespace std;

int main() {
    int n, x[26] = {0}, flag = 0;
    string s;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> s;
        x[s[0] - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
        if (x[i] >= 5) {
            cout << (char) (i + 'a');
            flag = 1;
        }
    }
    if (flag == 0) cout << "PREDAJA";

    return 0;
}