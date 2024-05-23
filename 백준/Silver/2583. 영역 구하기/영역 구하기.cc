#include <iostream>
#include <algorithm>
#include <queue>

using namespace std;

int m, n, k;
int graph[101][101];
bool visited [101][101];
int bfs(int x, int y);
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
vector <int> v;

int main() {
    int x1, y1, x2, y2;
    cin >> m >> n >> k;
    for (int i = 0; i < k; i++) {
        cin >> x1 >> y1 >> x2 >> y2;
        for (int j = y1; j < y2; j++) {
            for (int l = x1; l < x2; l++) {
                graph[j][l] = 1;
                visited[j][l] = true;
            }
        }
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (!visited[i][j] && !graph[i][j]) {
                v.push_back(bfs(i, j));
            }
        }
    }
    sort(v.begin(), v.end());
    cout << v.size() << "\n";
    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << ' ';
    }

    return 0;
}

int bfs(int x, int y) {
    int cnt = 1;
    queue<pair<int, int>> q;
    q.push({x, y});
    visited[x][y] = true;
    while (!q.empty()) {
        int cur_x = q.front().first;
        int cur_y = q.front().second;
        q.pop();
        for (int i = 0; i < 4; i++) {
            int nx = cur_x + dx[i];
            int ny = cur_y + dy[i];
            if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if (!graph[nx][ny] && !visited[nx][ny]) {
                cnt++;
                q.push(make_pair(nx, ny));
                visited[nx][ny] = true;
            }
        }
    }

    return cnt;
}