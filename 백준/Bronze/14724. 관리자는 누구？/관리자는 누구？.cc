#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    char x[9][10] = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
    int n, q[9] = {0}, s, maxs, maxi;
    cin >> n;
    for (int i = 0; i < 9; i++) {
        maxs = 0;
        for (int j = 0; j < n; j++) {
            cin >> s;
            if (s > maxs) maxs = s;
        }
        q[i] = maxs;
    }
    maxs = 0;
    for (int i = 0; i < 9; i++) {
        if (maxs < q[i]) {
            maxs = q[i];
            maxi = i;
        }        
    }
    cout << x[maxi];

    return 0;
}