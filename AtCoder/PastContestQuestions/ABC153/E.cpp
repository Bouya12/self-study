#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int dp[1010][10010];

int main() {
  int h, n;
  cin >> h >> n;
  vector<int> damage(n);
  vector<int> magic(n);
  rep (i, n) cin >> damage.at(i) >> magic.at(i);

  // DP‰ŠúğŒ
  for (int i = 0; i <= h; i++) {
    dp[0][i] = 0;
  }

  // DPƒ‹[ƒv
  for (int i = 0; i < n; i++) {
    for (int j = 0; j <= h; j++) {
      if (j >= damage.at(i)) {
        dp[i+1][j] = min(dp[i][j-damage.at(i)] + magic.at(i), dp[i][j]);
      } else {
        if (j - 1 > damage.at(i)) {
          dp[i+1][j] = min(dp[i][j-damage.at(i)] + magic.at(i), dp[i][j]);
        } else {
          dp[i+1][j] = dp[i][j];
        }
      }
    }
  }

  int ans;
  cout << ans << endl;
  return 0;
}