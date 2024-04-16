#include <iostream>

using namespace std;

int main() {
    int n, x[1000], cnt = 0, flag = 0;
    cin >> n;
    for (int i = 0; i < n; i++) cin >> x[i];
    for (int i = 0; i < n; i++) {
        if (flag == 0) {
            if (x[i] == 0) {
                flag = 1;
                cnt++;
            }
        }
        else if (flag == 1) {
            if (x[i] == 1) {
                flag = 2;
                cnt++;
            }
        }
        else if (flag == 2) {
            if (x[i] == 2) {
                flag = 0;
                cnt++;
            }
        }
    }
    cout << cnt;

    return 0;
}