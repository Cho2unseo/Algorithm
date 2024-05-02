#include <iostream>

using namespace std;

int main() {
    int n, flag = 0, ck = 0;
    string s;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> s;
        if (flag == 0) {
            for (int j = 0; j < s.length(); j++) {
                if (s[j] == 'S') flag = 1;
            }
        }
        if (flag == 1 && ck == 0) {
            cout << s;
            ck = 1;
        }
    }

    return 0;
}