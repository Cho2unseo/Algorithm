#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector <int> x;
    int n, num;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> num;
        x.push_back(num);
    }
    sort(x.begin(), x.end(), greater<>());
    for (int i = 0; i < n; i++) {
        cout << x[i] << "\n";
    }

    return 0;
}