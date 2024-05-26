#include <iostream>

using namespace std;

int main() {
    int t, n;
    long long bene = 0, maxp;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> n;
        bene = 0;
        maxp = 0;
        long long x[1000000] = {0};
        for (int j = 0; j < n; j++) {
            cin >> x[j];
        }
        for (int j = n - 1; j >= 0; j--) {
            maxp = max(maxp, x[j]);
            bene += maxp - x[j];
        }
        cout << bene << "\n";
    }

    return 0;
}