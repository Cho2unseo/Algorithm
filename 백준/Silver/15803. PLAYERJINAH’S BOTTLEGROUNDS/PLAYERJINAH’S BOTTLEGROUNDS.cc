#include <iostream>

using namespace std;

int main() {
    int x1, y1, x2, y2, x3, y3;
    cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;
    if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) cout << "WHERE IS MY CHICKEN?";
    else if ((double)(x2 - x1) / (y2 - y1) == (double)(x3 - x2) / (y3 - y2)) cout << "WHERE IS MY CHICKEN?";
    else cout << "WINNER WINNER CHICKEN DINNER!";

    return 0;
}