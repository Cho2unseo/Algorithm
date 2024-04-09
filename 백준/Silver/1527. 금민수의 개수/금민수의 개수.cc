#include <iostream>

using namespace std;

int cnt, a, b;

void func(long long n);

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> a >> b;
    func(4);
    func(7);
    cout << cnt;

    return 0;
}

void func(long long n) {
    if (n > b) return;
    if (n >= a && n <= b) cnt++;
    func(n * 10 + 4);
    func(n * 10 + 7);
}