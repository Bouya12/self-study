#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int64_t n, y;
  cin >> n >> y;

  int64_t total;
  string ans = "-1 -1 -1";
  for (int i = 0; i <= n; i++) {
    for (int j = 0; i + j <= n; j++) {
      int k = n - j - i;
      total = 10000 * k + 5000 * j + 1000 * i;
      if (total == y) {
        ans = to_string(k) + " " + to_string(j) + " " + to_string(i);
        break;
      }
    }
    if (total == y) break;
  }

  cout << ans << endl;
  return 0;
}