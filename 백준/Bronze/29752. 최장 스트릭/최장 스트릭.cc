#include <iostream>

using namespace std;

int main() {
    int n, x[1000], cnt = 0, max = 0;
    cin >> n;
    for (int i = 0; i < n; i++) cin >> x[i];
    for (int i = 0; i < n; i++) {
        if (x[i] == 0) cnt = 0;
        else cnt++;
        if (cnt > max) max = cnt;
    }
    cout << max;

    return 0;
}