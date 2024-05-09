#include <iostream>

using namespace std;

int main() {
    int n, x[10000000]; 
    cin >> n;
    x[0] = 1;
    x[1] = 2;
    for (int i = 2; i < n; i++) x[i] = (x[i - 2] + x[i - 1]) % 10;
    cout << x[n - 1];

    return 0;
}