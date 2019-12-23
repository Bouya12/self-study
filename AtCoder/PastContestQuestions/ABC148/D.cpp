#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

bool ableBreak(vector<int> brick) {
}

int main() {
  int n;
  cin >> n;
  vector<int> a(n); 
  rep (i, n) cin >> a.at(i);

  int num = 0;
  rep (i, a.size()) {
    if (a.at(i) == num + 1) num++;
  }

  int ans;
  if (num == 0) {
    ans = -1;
  } else {
    ans = n - num;
  }
  cout << ans << endl;
  return 0;
}