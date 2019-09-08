#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;

  vector<int> A(N);
  for (int i = 0; i < N; i++) {
    cin >> A.at(i);
  }

  bool even_flg = true;
  int cnt = 0;
  while (even_flg) {
    for (int i = 0; i < N; i++) {
      if (A.at(i) % 2 == 0) {
        A.at(i) /= 2;
      } else {
        even_flg = false;
        break;
      }
    }
    
    if (even_flg == true) {
      cnt++;
    }
  }

  cout << cnt << endl;
  return 0;
}