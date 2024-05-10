#include <iostream>

using namespace std;

int main() {
    int n;
    long long x[200000], max = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> x[i];
        if (max <= x[i] - (n - i + 1)) {
            max = x[i] - (n - i);
        }
    }
    cout << max;

    return 0;
}