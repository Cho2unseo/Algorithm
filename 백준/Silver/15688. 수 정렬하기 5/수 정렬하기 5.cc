#include <iostream>
#include <algorithm>

using namespace std;

int cmp(const void *a, const void *b);

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n, a[1000000];
    cin >> n;
    for (int i = 0; i < n; i++) cin >> a[i];
    qsort(a, n, sizeof(int), cmp);
    for (int i = 0; i < n; i++) cout << a[i] << "\n";
}

int cmp(const void *a, const void *b) {
    return *(int *)a - *(int *)b;
}