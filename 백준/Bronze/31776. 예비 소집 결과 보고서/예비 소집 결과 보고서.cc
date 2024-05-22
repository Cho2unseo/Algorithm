#include <iostream>

using namespace std;

int main() {
    int n, cnt = 0, a, b, c;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a >> b >> c;
        if (a == -1) continue;
        if (b >= a) {
            if (c >= b) {
                cnt++;
                continue;
            }
            else {
                if (c == -1) cnt++;
                continue;
            }
        }
        if (b == -1 && c == -1) cnt++;
    }
    cout << cnt;

    return 0;
}