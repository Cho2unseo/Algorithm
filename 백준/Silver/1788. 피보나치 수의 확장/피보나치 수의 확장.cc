#include <iostream>

using namespace std;

int main() {
    long long x[1000001];
    int n, flag = 1;
    cin >> n;
    if (n < 0) {
        n = n * (-1);
        if (n % 2 == 0) flag = -1;
    }
    x[0] = 0;
    x[1] = 1;
    for (int i = 2; i <= n; i++) {
        x[i] = (x[i - 1] + x[i - 2]) % 1000000000;
    }
    if (n == 0) flag = 0;
    cout << flag << "\n" << x[n] % 1000000000;

    return 0;
}