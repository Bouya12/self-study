#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int h, n;
  cin >> h >> n;
  vector<int> a(n);
  rep (i, n) cin >> a.at(i);
  sort(a.begin(), a.end());
  reverse(a.begin(), a.end());

  string ans = "No";
  rep (i, n) {
    h -= a.at(i);
    if (h <= 0) {
      ans = "Yes";
      break;
    }
  }
  cout << ans << endl;
  return 0;
}