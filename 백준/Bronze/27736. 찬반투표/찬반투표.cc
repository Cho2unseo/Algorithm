#include <iostream>

using namespace std;

int main() {
    int n, x[3] = {0}, p;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> p;
        if (p == 1) x[0]++;
        else if (p == -1) x[2]++;
        else x[1]++;
    }
    if (x[1] > n / 2) cout << "INVALID";
    else if (x[2] > x[0] || x[2] == x[0]) cout << "REJECTED";
    else cout << "APPROVED";

    return 0;
}