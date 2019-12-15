#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  string s;
  cin >> s;

  int cnt = 0;
  int len = s.length();
  int half = s.length() / 2;
  for (int i = 1; i < half - 1; i++) {
    if (s[i] != s[len - i]) {
      cnt++;
    }
  }

  cout << cnt << endl;
  return 0;
}