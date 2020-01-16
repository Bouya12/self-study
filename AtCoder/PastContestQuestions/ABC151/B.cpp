#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n, k, m;
  cin >> n >> k >> m;
  vector<int> a(n);
  rep (i, n - 1) {
    cin >> a.at(i);
  }
  int sum = 0;
  rep (i, n) sum += a.at(i);

  int ans;
  int x = (n * m) - sum;
  if (x < 0) {
    ans = 0;
  } else if (x > k) {
    ans = -1;
  } else {
    ans = x;
  }

  cout << ans << endl;
  return 0;
}