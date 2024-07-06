#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n, p, res;
    cin >> n >> p;
    if (n >= 20) {
        res = p - 2000;
        if (res <= 0) res = 0;
        cout << min(int(p * 0.75), res);
    }
    else if (n >= 15) {
        res = p - 2000;
        if (res <= 0) res = 0;
        cout << min(int(p * 0.9), res);
    }
    else if (n >= 10) {
        res = p - 500;
        if (res <= 0) res = 0;
        cout << min(int(p * 0.9), res);
    }
    else if (n >= 5) {
        res = p - 500;
        if (res <= 0) res = 0;
        cout << min(p, res);
    }
    else cout << p;

    return 0;
}