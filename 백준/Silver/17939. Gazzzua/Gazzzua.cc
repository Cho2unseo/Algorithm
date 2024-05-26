#include <iostream>

using namespace std;

int main() {
    int n, x[100000], maxm = 0;
    long long bene = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> x[i];
    }
    for (int i = n - 1; i >= 0; i--) {
        maxm = max(maxm, x[i]);
        bene += maxm - x[i];
    }
    cout << bene;

    return 0;
}