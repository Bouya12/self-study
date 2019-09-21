#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int N;
  cin >> N;

  vector<int> A(N);
  rep (i, N) cin >> A.at(i);

  int cnt = 0;
  bool flag = true;
  while (flag == true) {
    flag = false;
    for (int j = N - 1; j > 0; j--) {
      int v = A.at(j);
      if (v < A.at(j - 1)) {
        A.at(j) = A.at(j - 1);
        A.at(j - 1) = v;
        cnt++;
        flag = true;
      }
    }
  }

  rep (i, N) {
    if (i == N - 1) {
      cout << A.at(i) << endl;
    } else {
      cout << A.at(i) << " ";
    }
  }
  cout << cnt << endl;
  return 0;
}