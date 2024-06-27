#include <iostream>

using namespace std;

int main() {
    int x[21], a, b;
    for (int i = 1; i <= 20; i++) x[i] = i;
    for (int i = 0; i < 10; i++) {
        cin >> a >> b;
        for (int j = a, k = b; j <= a + (b - a) / 2; j++, k--) {
            swap(x[j], x[k]);
        }
    }
    for (int i = 1; i <= 20; i++) cout << x[i] << ' ';

    return 0;
}