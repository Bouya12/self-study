#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  string s; cin >> s;
  int k; cin >> k;

  // 全文字が同じの場合は例外処理の必要があるためチェック
  bool isSame = true;
  for (int i = 1; i < s.size(); i++) {
    if (s.at(i) != s.at(i -1)) {
      isSame = false;
      break;
    }
  }

  int sameA = 1, sameB = 1;
  int sameCnt = 1;
  int64_t cnt = 0;
  if (isSame) {
    cnt = s.size() * k / 2;
  } else {
    for (int i = 1; i < s.size(); i++) {
      if (s.at(i) == s.at(i - 1)) {
        sameCnt++;
      } else {
        cnt += sameCnt / 2;
        sameCnt = 1;
      }
    }
    cnt += sameCnt / 2;
    cnt *= k;

    if (k >= 2 && s.at(0) == s.at(s.size() - 1)) {

      // 先頭から同じ文字が何回続くか確認
      for (int i = 1; i < s.size(); i++) {
        if (s.at(i) == s.at(i - 1)) {
          sameA++;
        } else {
          break;
        }
      }

      // 末尾から同じ文字が何回続くか確認
      for (int i = s.size() - 1; i >= 0; i--) {
        if (s.at(i) == s.at(i - 1)) {
          sameB++;
        } else {
          break;
        }
      }

      cnt -= (sameA / 2 + sameB / 2 - (sameA + sameB) / 2) * (k - 1);

    }
  }

  cout << cnt << endl;

  return 0;
}