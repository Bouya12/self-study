// AtCoder Beginner Contest 140
// B - Buffet
#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;

  vector<int> A(N), B(N), C(N - 1);
  for (int i = 0; i < N; i++) {
    cin >> A.at(i);
  }

  for (int i = 0; i < N; i++) {
    cin >> B.at(i);
  }

  for (int i = 0; i < N - 1; i++) {
    cin >> C.at(i);
  }

  int before = -1;
  int ans = 0;
  for (int i = 0; i < N; i++) {
    ans += B.at(A.at(i) - 1);
    if (before != -1 && A.at(i) == before + 1) {
      ans += C.at(A.at(i) - 2);
    }
    before = A.at(i);
  }

  cout << ans << endl;
}