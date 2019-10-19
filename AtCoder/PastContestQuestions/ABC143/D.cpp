#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

bool isTriangle(int a, int b, int c) {
  if (a >= b + c || b >= c + a || c >= a + b) {
    return false;
  } else {
    return true;
  }
}

int main() {
  int n;
  cin >> n;

  vector<int> l(n);
  rep (i, n) cin >> l[i];

  sort(l.begin(), l.end());

  int ans = 0;
  for (int a = 0; a < n - 1; a++) {
    for (int b = a + 1; b < n - 1; b++) {
      for (int c = b + 1; c < n; c++) {
        if (isTriangle(l[a], l[b], l[c])) {
          ans++;
        } else {
          break;
        }
      }
    }
  }

  cout << ans << endl;
  return 0;
}