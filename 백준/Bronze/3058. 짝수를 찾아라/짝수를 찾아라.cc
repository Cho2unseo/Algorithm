#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int t, n, s, minn;
    cin >> t;
    for (int i = 0; i < t; i++) {
        s = 0;
        minn = 100;
        for (int j = 0; j < 7; j++) {
            cin >> n;
            if (n % 2 == 0) {
                s = s + n;
                minn = min(minn, n);
            }
        }
        cout << s << ' ' << minn << "\n";
    }
}