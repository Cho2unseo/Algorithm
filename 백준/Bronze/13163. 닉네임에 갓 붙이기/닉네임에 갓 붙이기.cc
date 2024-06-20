#include <iostream>
#include <string>

using namespace std;

int main() {
    int n, flag;
    string s, news;
    cin >> n;
    getchar();
    for (int i = 0; i < n; i++) {
        flag = 0;
        news = "god";
        getline(cin, s);
        for (int j = 0; j < s.length(); j++) {
            if (s[j] == ' ') {
                flag = 1;
                continue;
            }
            if (flag == 1) news += s[j];
        }
        cout << news << "\n";
    }

    return 0;
}