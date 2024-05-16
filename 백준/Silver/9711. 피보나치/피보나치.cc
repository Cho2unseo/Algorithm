#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int t, p, q;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> p >> q;
        long long f[10001];
        f[0] = 1 % q;
        f[1] = 1 % q;
        for (int j = 2; j <= p; j++) {
            f[j] = (f[j - 1] + f[j - 2]) % q;
        }
        cout << "Case #" << i + 1 << ": " << f[p - 1] << "\n";
    }

    return 0;
}