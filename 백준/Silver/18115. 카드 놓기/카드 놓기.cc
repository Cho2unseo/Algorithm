#include <iostream>
#include <deque>

using namespace std;

int main() {
    deque <int> d;
    int n, x[1000000], tmp, cnt = 1;
    cin >> n;
    for (int i = 0; i < n; i++) cin >> x[i];
    for (int i = n - 1; i >= 0; i--) {
        if (x[i] == 1) {
            d.push_back(cnt);
        }
        else if (x[i] == 2) {
            tmp = d.back();
            d.pop_back();
            d.push_back(cnt);
            d.push_back(tmp);
        }
        else if (x[i] == 3) {
            d.push_front(cnt);
        }
        cnt++;
    }
    for (int i = n - 1; i >= 0; i--) cout << d[i] << ' ';


    return 0;
}