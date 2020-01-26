#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int main() {
  int64_t n, k;
  cin >> n >> k;
  vector<int64_t> h(n);
  rep (i, n) cin >> h.at(i);
  sort(h.begin(), h.end());

  int64_t remaining = n - k;
  if (remaining <= 0) {
    cout << 0 << endl;
  } else {
    int64_t sum = 0;
    rep (i, remaining) {
      sum += h.at(i);
    }
    cout << sum << endl;
  }

  return 0;
}