#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int N;
  cin >> N;

  vector<int> A(N);
  rep (i, N) cin >> A.at(i);

  int cnt = 0;
  rep (i, N) {
    int minj = i;
    int v = A.at(i);
    for (int j = i; j < N; j++) {
      if (A.at(j) < A.at(minj)) {
        minj = j;
      }
    }
    if (v != A.at(minj)) {
      A.at(i) = A.at(minj);
      A.at(minj) = v;
      cnt++;
    }
  }

  rep (i, N) {
    if (i != 0) cout << " ";
    cout << A.at(i);
  }
  cout << endl;
  cout << cnt << endl;
  return 0;
}