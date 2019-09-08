#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int A, B, C, X;
  cin >> A >> B >> C >> X;

  int cnt = 0;
  rep (i, A + 1) {
    rep (j, B + 1) {
      rep (k, C + 1) {
        int total = 500 * i + 100 * j + 50 * k;
        if (total == X) cnt++;
      }
    }
  }

  cout << cnt << endl;
  return 0;
}