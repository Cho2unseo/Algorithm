#include <stdio.h>
#include <stdlib.h>

#define INF 2147483647

typedef struct Edge {
    int u, v, weight;
} Edge;

typedef struct Graph {
    int n;
    Edge edges[200000];
} Graph;

int n, m, p[10001];
Edge H[200001];

void init(Graph *G);
int cmp(const void *a, const void *b);
void insert(Graph *G, int u, int v, int w);
int find(int now);
void unionn(int a, int b);
void kruskal(Graph *G);

int main() {
    Graph G;
    int i, u, v, w;
    init(&G);
    scanf("%d%d", &n, &m);
    for (i = 0; i < m; i++) {
        scanf("%d%d%d", &u, &v, &w);
        insert(&G, u, v, w);
    }
    qsort(G.edges, G.n, sizeof(G.edges[0]), cmp);

    for (i = 0; i < n; i++) p[i] = -1;
    kruskal(&G);

    return 0;
}

void init(Graph *G) {
    int i;
    G->n = 0;
    for (i = 0; i < n; i++) {
        G->edges[i].u = 0;
        G->edges[i].v = 0;
        G->edges[i].weight = INF;
    }
}

int cmp(const void *a, const void *b) {
    Edge *aa = (Edge *)a;
    Edge *bb = (Edge *)b;

    if (aa->weight > bb->weight) return 1;
    else if (aa->weight == bb->weight) return 0;
    return -1;
}

void insert(Graph *G, int u, int v, int w) {
    G->edges[G->n].u = u;
    G->edges[G->n].v = v;
    G->edges[G->n].weight = w;
    G->n++;
}

int find(int now) {
    if (p[now] == -1) return now;
    return p[now] = find(p[now]);
}

void unionn(int a, int b) {
    int roota, rootb;
    roota = find(a);
    rootb = find(b);
    if (roota != rootb) p[roota] = rootb;
}

void kruskal(Graph *G) {
    Edge e;
    int i, cnt = 0, fu, fv;
    long long sum = 0;
    for (i = 0; i < m; i++) {
        e = G->edges[i];
        fu = find(e.u);
        fv = find(e.v);
        if (fu != fv) {
            sum += e.weight;
            unionn(fu, fv);
        }
        if (cnt == n - 1) break;
    }
    printf("%lld", sum);
}