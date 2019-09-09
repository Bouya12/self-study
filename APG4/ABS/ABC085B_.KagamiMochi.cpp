#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  cin >> n;

  vector<int> d(n);
  rep (i, n) cin >> d.at(i);

  sort(d.begin(), d.end());
  reverse(d.begin(), d.end());

  int ans = 1;
  int under = d.at(0);
  for (int i = 1; i < n; i++) {
    if (d.at(i) < under) {
      ans++;
      under = d.at(i);
    }
  }

  cout << ans << endl;
  return 0;
}