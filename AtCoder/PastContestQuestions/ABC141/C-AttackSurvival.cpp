// AtCoder Beginner Contest 141
// C - Attack Survival
#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n, k, q;
  cin >> n >> k >> q;

  vector<int> a(q);
  rep (i, q) cin >> a.at(i);

  vector<int> answer(n, k);
  rep (i, q) {
    answer.at(a.at(i) - 1)++;
  }

  rep (i, n) {
    if (answer.at(i) - q > 0) {
      cout << "Yes" << endl;
    } else {
      cout << "No" << endl;
    }
  }

  return 0;
}
