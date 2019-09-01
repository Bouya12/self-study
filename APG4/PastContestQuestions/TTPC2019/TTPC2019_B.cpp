// 東京工業大学プログラミングコンテスト2019
// B - okyoech
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int N;
  cin >> N;

  for (int i = 0; i < N; i++) {
    string S;
    cin >> S;

    smatch sm;
    if (regex_search(S, sm, regex(".*okyo.*ech"))) {
      cout << "Yes" << endl;
    } else {
      cout << "No" << endl;
    }
  }
}