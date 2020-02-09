#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int main() {
  int64_t n;
  cin >> n;
  vector<int> a(n);
  rep (i, n) cin >> a.at(i);
  sort(a.begin(), a.end());

  string ans = "YES";
  int currentNo = 0;
  rep (i, n) {
    if (currentNo == a.at(i)) {
      ans = "NO";
      break;
    } else {
      currentNo = a.at(i);
    }
  }

  cout << ans << endl;
  return 0;
}