#include <iostream>
#include <string>

using namespace std;

int main() {
    char str[26][9] = {"aespa", "baekjoon", "cau", "debug", "edge", "firefox", "golang", "haegang", "iu", "java", "kotlin", "lol", "mips", "null", "os", "python", "query", "roka", "solvedac", "tod", "unix", "virus", "whale", "xcode", "yahoo", "zebra"};
    char ord[8000000];
    int flag = 0, idx = 0, j;
    string s;
    cin >> s;
    for (int i = 0; i < s.length(); i++) {
        char tmp = s[i];
        while (str[tmp - 'a'][j] != '\0') {
            if (str[tmp - 'a'][j] != s[i]) {
                flag = 1;
                break;
            }
            else {
                j++;
                i++;
            }
        }
        if (flag == 1) break;
        else {
            ord[idx] = tmp;
            idx++;
            j = 0;
            i--;
        }
        
    }
    if (flag == 1) cout << "ERROR!";
    else {
        cout << "It's HG!\n";
        cout << ord;
    }


    return 0;
}