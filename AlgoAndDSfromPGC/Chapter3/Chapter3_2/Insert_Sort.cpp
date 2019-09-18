#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int N;
  cin >> N;

  vector<int> A(N);
  rep (i, N) cin >> A.at(i);

  rep (i, N) {
    int v = A.at(i);
    int j = i - 1;
    while (j >= 0 && A.at(j) > v) {
      A.at(j + 1) = A.at(j);
      j--;
    }
    A.at(j + 1) = v;

    rep (k, N) {
      cout << A.at(k);
      if (k < N - 1) {
        cout << " ";
      } else {
        cout << endl;
      }
    }
  }

  return 0;
}