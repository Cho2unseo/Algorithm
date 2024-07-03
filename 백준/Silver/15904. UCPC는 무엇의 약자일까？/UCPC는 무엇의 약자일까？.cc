#include <iostream>

using namespace std;

int main() {
    int flag = 0;
    string s;
    getline(cin, s);
    for (int i = 0; i < s.length(); i++) {
        if (flag == 0) {
            if (s[i] == 'U') flag = 1;
        }
        if (flag == 1) {
            if (s[i] == 'C') flag = 2;
        }
        if (flag == 2) {
            if (s[i] == 'P') flag = 3;
        }
        if (flag == 3) {
            if (s[i] == 'C') flag = 4;
        }
    }
    if (flag == 4) cout << "I love UCPC";
    else cout << "I hate UCPC";

    return 0;
}