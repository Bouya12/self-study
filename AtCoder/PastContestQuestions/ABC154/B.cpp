#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int main() {
  string s;
  cin >> s;
  int x_cnt = s.length();

  string ans = "x";
  rep (i, x_cnt) ans += "x";
  cout << ans << endl;
  return 0;
}