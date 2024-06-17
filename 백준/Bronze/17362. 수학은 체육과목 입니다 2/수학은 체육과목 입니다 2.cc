#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    if (n % 8 == 0 || n % 8 == 2) cout << 2;
    else if (n % 8 == 1) cout << 1;
    else if (n % 8 == 3 || n % 8 == 7) cout << 3;
    else if (n % 8 == 4 || n % 8 == 6) cout << 4;
    else if (n % 8 == 5) cout << 5;


    return 0;
}
/*
1 9 17
2 8 10 16 18 23
3 7 11 15 19 22
4 6 12 14 20 21
5 13 21
*/