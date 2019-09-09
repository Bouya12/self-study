#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  cin >> n;

  vector<int> a(n);
  rep (i, n) {
    cin >> a.at(i);
  }

  sort(a.begin(), a.end());

  int cnt = n - 1;
  int alice = 0;
  int bob = 0;
  while (a.size() > 0) {
    alice += a.at(cnt);
    a.pop_back();
    cnt--;
    if (cnt >= 0) {
      bob += a.at(cnt);
      a.pop_back();
      cnt--;
    }
  }

  cout << alice - bob << endl;
  return 0;
}