#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int k1, k2, k3, s1, s2;
    char o1, o2;
    cin >> k1 >> o1 >> k2 >> o2 >> k3;
    if (o1 == '+') {
        if (o2 == '+') {
            s1 = (k1 + k2) + k3;
            s2 = k1 + (k2 + k3);
        }
        else if (o2 == '-') {
            s1 = (k1 + k2) - k3;
            s2 = k1 + (k2 - k3);
        }
        else if (o2 == '*') {
            s1 = (k1 + k2) * k3;
            s2 = k1 + (k2 * k3);
        }
        else if (o2 == '/') {
            s1 = (k1 + k2) / k3;
            s2 = k1 + (k2 / k3);
        }
    }
    else if (o1 == '-') {
        if (o2 == '+') {
            s1 = (k1 - k2) + k3;
            s2 = k1 - (k2 + k3);
        }
        else if (o2 == '-') {
            s1 = (k1 - k2) - k3;
            s2 = k1 - (k2 - k3);
        }
        else if (o2 == '*') {
            s1 = (k1 - k2) * k3;
            s2 = k1 - (k2 * k3);
        }
        else if (o2 == '/') {
            s1 = (k1 - k2) / k3;
            s2 = k1 - (k2 / k3);
        }
    }
    else if (o1 == '*') {
        if (o2 == '+') {
            s1 = (k1 * k2) + k3;
            s2 = k1 * (k2 + k3);
        }
        else if (o2 == '-') {
            s1 = (k1 * k2) - k3;
            s2 = k1 * (k2 - k3);
        }
        else if (o2 == '*') {
            s1 = (k1 * k2) * k3;
            s2 = k1 * (k2 * k3);
        }
        else if (o2 == '/') {
            s1 = (k1 * k2) / k3;
            s2 = k1 * (k2 / k3);
        }
    }
    else if (o1 == '/') {
        if (o2 == '+') {
            s1 = (k1 / k2) + k3;
            s2 = k1 / (k2 + k3);
        }
        else if (o2 == '-') {
            s1 = (k1 / k2) - k3;
            s2 = k1 / (k2 - k3);
        }
        else if (o2 == '*') {
            s1 = (k1 / k2) * k3;
            s2 = k1 / (k2 * k3);
        }
        else if (o2 == '/') {
            s1 = (k1 / k2) / k3;
            s2 = k1 / (k2 / k3);
        }
    }
    cout << min(s1, s2) << "\n" << max(s1, s2);

    return 0;
}