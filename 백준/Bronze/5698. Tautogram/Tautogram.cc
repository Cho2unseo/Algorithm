#include <iostream>

using namespace std;

int main() {
    string s;
    while (1) {
        int flag = 0;
        getline(cin, s);
        if (s == "*") break;
        char f;
        f = toupper(s[0]);
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == ' ') {
                if (f != toupper(s[i + 1])) {
                    cout << "N\n";
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) cout << "Y\n";
    }

    return 0;
}