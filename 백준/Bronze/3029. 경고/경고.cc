#include <iostream>

using namespace std;

int main() {
    int h1, h2, m1, m2, s1, s2, h3 = 0, m3, s3;
    scanf("%d:%d:%d", &h1, &m1, &s1);
    scanf("%d:%d:%d", &h2, &m2, &s2);
    if (s1 > s2) {
        s2 += 60;
        m2--;
    }
    s3 = s2 - s1;
    if (m1 > m2) {
        m2 += 60;
        h2--;
    }
    m3 = m2 - m1;
    if (h1 > h2) h2 += 24;
    h3 = h2 - h1;
    if (h3 == 0 && m3 == 0 && s3 == 0) h3 = 24;
    printf("%02d:%02d:%02d", h3, m3, s3);

    return 0;
}