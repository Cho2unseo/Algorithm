#include <iostream>

using namespace std;

int k, a[500001], cnt;

void heap_sort(int n);
void build_min_heap(int n);
void heapify(int b, int n);

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin >> n >> k;
    for (int i = 1; i <= n; i++) cin >> a[i];
    heap_sort(n);
    //cout << cnt;
    if (cnt < k) cout << -1;

    return 0;
}

void heap_sort(int n) {
    build_min_heap(n);
    for (int i = n; i >= 2; i--) {
        int tmp = a[1];
        a[1] = a[i];
        a[i] = tmp;
        cnt++;
        if (cnt == k) {
            cout << min(a[1], a[i]) << ' ' << max(a[1], a[i]);
        }
        heapify(1, i - 1);
    }
}

void build_min_heap(int n) {
    for (int i = n / 2; i >= 1; i--) {
        heapify(i, n);
    }
}

void heapify(int b, int n) {
    int left, right, smaller;
    left = 2 * b;
    right = 2 * b + 1;
    if (right <= n) {
        if (a[left] < a[right]) smaller = left;
        else smaller = right;
    }
    else if (left <= n) smaller = left;
    else return;

    if (a[smaller] < a[b]) {
        int tmp = a[b];
        a[b] = a[smaller];
        a[smaller] = tmp;
        cnt++;
        if (cnt == k) {
            cout << min(a[smaller], a[b]) << ' ' << max(a[smaller], a[b]);
        }
        heapify(smaller, n);
        
    }
}