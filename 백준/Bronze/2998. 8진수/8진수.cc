#include <iostream>

using namespace std;

int main() {
    string s, c;
    cin >> s;
    if (s.length() % 3 == 1) {
        c = "00";
        c += s;
    }
    else if (s.length() % 3 == 2) {
        c = "0";
        c += s;
    }
    else c = s;
    for (int i = 0; i < c.length(); i+=3) {
        if (c[i] == '0') {
            if (c[i + 1] == '0') {
                if (c[i + 2] == '0') cout << '0';
                else cout << '1';
            }
            else {
                if (c[i + 2] == '0') cout << '2';
                else cout << '3';
            }
        } 
        else if (c[i] == '1') {
            if (c[i + 1] == '0') {
                if (c[i + 2] == '0') cout << '4';
                else cout << '5';
            }
            else {
                if (c[i + 2] == '0') cout << '6';
                else cout << '7';
            }
        }
    }

    return 0;
}