#include <iostream>
#include <string>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string s = "SciComLove", news = "";
    int n, q, cnt = 0;
    cin >> n >> q;
    for (int i = 0; i < n / 10; i++) news += s;
    news += s.substr(0, n % 10);
    for (char c: news) {
        if (isupper(c)) cnt++;
    }
    for (int i = 1; i <= q; i++) {
        int x;
        cin >> x;
        if (islower(news[x - 1])) {
            news[x - 1] = toupper(news[x - 1]);
            cnt++;
        }
        else if (isupper(news[x - 1])) {
            news[x - 1] = tolower(news[x - 1]);
            cnt--;
        }
        cout << cnt << "\n";
    }

    return 0;
}