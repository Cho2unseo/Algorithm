#include <iostream>

using namespace std;

int main() {
    int n, flag = 0;
    string s;
    cin >> n;
    cin >> s;
    for (int i = 0; i < s.length(); i++) {
        if (!(s[i] == 'J' || s[i] == 'A' || s[i] == 'V')) {
            cout << s[i];
            flag = 1;
        }
    }
    if (flag == 0) cout << "nojava";

    return 0;
}