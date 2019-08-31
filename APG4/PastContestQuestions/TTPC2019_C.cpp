// 東京工業大学プログラミングコンテスト2019
// C - XOR Filling
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int N, X;
  cin >> N >> X;

  vector<int> a(N);
  int ans = 0;
  int lost = 0;
  for (int i = 0; i < N; i++) {
    cin >> a.at(i);
    if (a.at(i) != -1) {
      ans ^= a.at(i);
    } else {
      lost++;
    }
  }

  // 2進数変換時の桁数取得
  int digit = 1;
  int xd = X;
  while (xd > 2) {
    xd /= 2;
    digit++;
  }

  // Nの桁数における2進数の最大値取得
  int max = 1;
  for (int i = 0; i < digit; i++) {
    max *= 2;
  }
  max -= 1;

  int much;
  bool exist = false;
  if (lost > 0) {
    for (int i = max; i > 0; i--) {
      if (ans ^ i == X) {
        much = i;
        exist = true;
        break;
      }
    }
  }

  vector<int> a_mod(N);
  if (exist == false) {
    cout << -1 << endl;
  } else {
    bool flg = false;
    for (int i = 0; i < N; i++) {
      if (a.at(i) != -1) {
        a_mod.at(i) = a.at(i);
      } else if (flg == false) {
        a_mod.at(i) = much;
        flg = true;
      } else {
        a_mod.at(i) = 0;
      }
    }
    
    for (int i = 0; i < N; i++) {
      if (i == 0) {
        cout << a_mod.at(i);
      } else {
        cout << " " << a_mod.at(i);
      }
    }
    cout << endl;
  }
}