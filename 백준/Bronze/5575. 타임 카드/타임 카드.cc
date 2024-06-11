#include <iostream>

using namespace std;

int main() {
    int h1, m1, s1, h2, m2, s2, h, m, s;
    for (int i = 0; i < 3; i++) {
        cin >> h1 >> m1 >> s1 >> h2 >> m2 >> s2;
        if (s2 < s1) {
            m1++;
            s = s2 + 60 - s1;
        }
        else s = s2 - s1;
        if (m2 < m1) {
            h1++;
            m = m2 + 60 - m1;
        }
        else m = m2 - m1;
        h = h2 - h1;
        cout << h << ' ' << m << ' ' << s << "\n";
    }

    return 0;
}