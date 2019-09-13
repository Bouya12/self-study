#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  cin >> n;

  vector<int> t(n + 1);
  vector<int> x(n + 1);
  vector<int> y(n + 1);

  rep (i, n) cin >> t.at(i + 1) >> x.at(i + 1) >> y.at(i + 1);

  bool movable = true;
  for (int i = 1; i <= n; i++) {
    int dt = t.at(i) - t.at(i - 1);
    int dxy = abs((x.at(i)) - x.at(i - 1)) + abs((y.at(i)) - y.at(i - 1));
    if (dt < dxy) movable = false;
    if (dt % 2 != dxy % 2) movable  = false;
  }

  if (movable == true) {
    cout << "Yes" << endl; 
  } else {
    cout << "No" << endl; 
  }
  
  return 0;
}