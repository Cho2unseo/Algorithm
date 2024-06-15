#include <iostream>
#include <string>

using namespace std;

int main() {
    string s = "SciComLove", news = "";
    int n, q;
    cin >> n >> q;
    for (int i = 0; i < n / 10; i++) news += s;
    news += s.substr(0, n % 10);
    for (int i = 1; i <= q; i++) {
        int cnt = 0;
        int x;
        cin >> x;
        if (news[x - 1] >= 'a' && news[x - 1] <= 'z') news[x - 1] = news[x - 1] - ('a' - 'A');
        else if (news[x - 1] >= 'A' && news[x - 1] <= 'Z') news[x - 1] = news[x - 1] + ('a' - 'A');
        for (int j = 0; j < news.length(); j++) {
            if (news[j] >= 'A' && news[j] <= 'Z') cnt++;
        }
        cout << cnt << "\n";
    }

    return 0;
}