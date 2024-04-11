#include <iostream>

using namespace std;

int main() {
    int n, cnt = 1, sum = 0;
    cin >> n;
    while (1) {
        sum += cnt;
        if (sum > n) break;
        cnt++;
    }
    if (cnt % 2 == 0) cout << 0;
    else cout << sum - n;

    return 0;
}