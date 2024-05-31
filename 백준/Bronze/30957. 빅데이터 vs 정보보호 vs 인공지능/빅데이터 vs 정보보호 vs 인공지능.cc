#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n, a[3] = {0}, maxv = 0;
    char x, al[3] = {'B', 'S', 'A'};
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> x;
        if (x == 'B') a[0]++;
        else if (x == 'S') a[1]++;
        else if (x == 'A') a[2]++;
    }
    if ((a[0] == a[1]) && (a[1] == a[2])) cout << "SCU";
    else {
        maxv = max(a[0], max(a[1], a[2]));
        for (int i = 0; i < 3; i++) {
            if (maxv == a[i]) cout << al[i];
        }
    }

    return 0;
}