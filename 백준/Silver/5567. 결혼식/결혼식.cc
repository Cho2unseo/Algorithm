#include <iostream>
#include <vector>
#include <queue>

using namespace std;

vector <int> map[501];
int isVisited[501];
int cnt;
void bfs(int start);

int main() {
    int n, m, a, b;
    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        cin >> a >> b;
        map[a].push_back(b);
        map[b].push_back(a);
    }
    bfs(1);
    cout << cnt;

    return 0;
}

void bfs(int start) {
    queue <int> q;
    isVisited[start] = 1;
    q.push(start);
    while (!q.empty()) {
        int x = q.front();
        q.pop();
        for (int i = 0; i < map[x].size(); i++) {
            int y = map[x][i];
            if (!isVisited[y]) {
                q.push(y);
                isVisited[y] = isVisited[x] + 1;
                if (isVisited[x] <= 2) cnt++;
            }
        }
    }
}