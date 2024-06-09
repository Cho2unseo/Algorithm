#include <iostream>
#include <queue>

using namespace std;

int main() {
    int n;
    queue <char> q;
    cin >> n;
    q.push('S');    
    q.push('c');
    q.push('i');
    q.push('C');
    q.push('o');
    q.push('m');
    q.push('L');
    q.push('o');
    q.push('v');
    q.push('e');

    for (int i = 0; i < n; i++) {
        q.push(q.front());
        q.pop();
    }
    while (!q.empty()) {
        cout << q.front();
        q.pop();
    }

    return 0;
}