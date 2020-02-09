#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int main() {
  string s, t, u;
  int64_t a, b;
  cin >> s >> t >> a >> b >> u;

  if (s == u) a--;
  if (t == u) b--;
  cout << a << " " << b << endl;
  return 0;
}