#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int main() {
  int64_t n, k;
  cin >> n >> k;
  vector<int64_t> p(n);
  rep (i, n) cin >> p.at(i);

  vector<double> exVal(n);
  rep (i, n) exVal.at(i) = (1 + p.at(i)) / 2.0;

  double total = 0.0;
  for (int i = 0; i < k; i++) total += exVal.at(i);
  double maxTotal = total;
  for (int i = 1; i <= n - k; i++) {
    total -= (exVal.at(i - 1));
    total += (exVal.at(i + k - 1));
    maxTotal = max(maxTotal, total);
  }

  cout << fixed << setprecision(10) << maxTotal << endl;
  return 0;
}
