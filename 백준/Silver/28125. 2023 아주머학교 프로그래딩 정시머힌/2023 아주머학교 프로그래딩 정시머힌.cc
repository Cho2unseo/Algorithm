#include <iostream>
#include <string>

using namespace std;

int main() {
    int n, cnt = 0, len = 0, flag = 0;
    string s;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cnt = 0;
        len = 0;
        flag = 0;
        cin >> s;
        for (int j = 0; j < s.length(); j++) {
            if (s[j] == '\\') {
                cnt++;
                len++;
                if (s[j + 1] == '\'') {
                    j++;
                }
                else j += 2;
            }
            else if (!(s[j] >= 'a' && s[j] <= 'z')) {
                cnt++;
                len++;
            }
            else len++;
        }
        if (cnt >= len / 2.0) {
            cout << "I don't understand\n";
            flag = 1;
        }
        if (flag == 0) {
            for (int j = 0; j < s.length(); j++) {
                switch (s[j])
                {
                case '@':
                    cout << 'a';
                    break;
                case '[':
                    cout << 'c';
                    break;
                case '!':
                    cout << 'i';
                    break;
                case ';':
                    cout << 'j';
                    break;
                case '^':
                    cout << 'n';
                    break;
                case '0':
                    cout << 'o';
                    break;
                case '7':
                    cout << 't';
                    break;
                case '\\':
                    if (s[j + 1] == '\'') {
                        cout << 'v';
                        j++;
                    }
                    else {
                        cout << 'w';
                        j += 2;
                    }
                    break;
                default:
                    cout << s[j];
                }
            }
            cout << "\n";
        }
    }

    return 0;
}