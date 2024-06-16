#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <bool> isVisited;
vector <vector<int>> graph;
vector <int> order;

int N, M, R;
int cnt = 1;
void DFS(int curr, int depth);

int main() {
    int u, v;
    cin >> N >> M >> R;
    graph.assign(N + 1, vector<int> (0, 0));
    isVisited.assign(N + 1, false);
    order.assign(N + 1, 0);
    for (int i = 0; i < M; i++) {
        cin >> u >> v;
        graph[u].emplace_back(v);
        graph[v].emplace_back(u);
    }
    for (int i = 1; i <= N; i++) {
        sort(graph[i].begin(), graph[i].end(), greater<>());
    }
    DFS(R, 0);
    for (int i = 1; i <= N; i++) {
        if (isVisited[i] == false) order[i] =  -1;
    }
    for (int i = 1; i <= N; i++) {
        cout << order[i] << "\n";
    }

    return 0;
}

void DFS(int curr, int depth) {
    isVisited[curr] = true;
    order[curr] = depth;
    for (int i = 0; i < graph[curr].size(); i++) {
        int next = graph[curr][i];
        if (!isVisited[next]) DFS(next, depth + 1);
    }
}