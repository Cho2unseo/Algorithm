#include <iostream>

using namespace std;

int main() {
    int n, cnt = 0;
    while (1) {
        cin >> n;
        if (n == -1) break;
        cnt += n;
    }
    cout << cnt;

    return 0;
}