// AtCoder Beginner Contest 140
// C - Maximam Value
#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;

  vector<int> B(N - 1);
  for (int i = 0; i < N - 1; i++) {
    cin >> B.at(i);
  }

  vector<int> A(N);
  A.at(0) = B.at(0);
  A.at(N - 1) = B.at(N - 2);
  for (int i = 1; i < N - 1; i++) {
    A.at(i) = min(B.at(i), B.at(i - 1));
  }

  int ans = 0;
  for (int i = 0; i < N; i++) {
    ans += A.at(i);
  }
  cout << ans << endl;
}