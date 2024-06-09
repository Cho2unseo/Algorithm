#include <iostream>
#include <string>

using namespace std;

int main() {
    string s = "SciComLove";
    int n;
    cin >> n;
    cout << s.substr(n % 10) << s.substr(0, n % 10);
}