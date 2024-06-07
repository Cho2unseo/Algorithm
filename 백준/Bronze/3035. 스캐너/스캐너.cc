#include <iostream>

using namespace std;

int main() {
    int r, c, zr, zc;
    char x[50][50];
    cin >> r >> c >> zr >> zc;
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            cin >> x[i][j];
        }
    }
    for (int i = 0; i < r; i++) {
        for (int k = 0; k < zr; k++) {
            for (int j = 0; j < c; j++) {
                //cout << x[i][j];
                for (int l = 0; l < zc; l++) {
                    cout << x[i][j];
                }
            }
            cout << "\n";
        }
    }

    return 0;
}