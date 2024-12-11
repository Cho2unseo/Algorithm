#include <stdio.h>

#define INF 2147483647

int n, m, s, t, edges[5001][5001], isVisited[5001], dist[5001];

int getMinIndex();

int main() {
    scanf("%d%d", &n, &m);
    int i, j, from, to, w, now;
    for (i = 1; i < n + 1; i++) {
        for (j = 1; j < n + 1; j++) {
            edges[i][j] = INF;
        }
    }
    for (i = 0; i < m; i++) {
        scanf("%d%d%d", &from, &to, &w);
        edges[from][to] = edges[to][from] = w;
    }
    scanf("%d%d", &s, &t);
    isVisited[s] = 1;
    for (i = 1; i < n + 1; i++) {
        dist[i] = edges[s][i];
    }
    dist[s] = 0;
    for (i = 0; i < n - 1; i++) {
        now = getMinIndex();
        if (now == INF) break;
        isVisited[now] = 1;
        for (j = 1; j < n + 1; j++) {
            if (edges[now][j] != INF && dist[now] + edges[now][j] < dist[j]) {
                dist[j] = dist[now] + edges[now][j];
            }
        }
    }
    printf("%d", dist[t]);

    return 0;
}

int getMinIndex() {
    int ret = INF, min = INF, i;
    for (i = 1; i < n + 1; i++) {
        if (isVisited[i] == 0 && dist[i] < min) {
            min = dist[i];
            ret = i;
        }
    }
    return ret;
}