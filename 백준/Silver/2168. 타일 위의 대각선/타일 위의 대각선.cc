#include <iostream>

using namespace std;

int gcd(int a, int b);

int main() {
    int x, y;
    cin >> x >> y;
    if (x == y) cout << x;
    else if (x == 1) cout << y;
    else if (y == 1) cout << x;
    else {
        int tmp = gcd(x, y);
        if (tmp == 1) cout << x + y - 1;
        else cout << x + y - tmp;
    }

    return 0;
}

int gcd(int a, int b) {
    int c;
    while (b > 0) {
        c = a % b;
        a = b;
        b = c;
    }
    return a;
}