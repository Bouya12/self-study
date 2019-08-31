// 東京工業大学プログラミングコンテスト2019
// A - Next TTPC
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int A, B, T;
  cin >> A >> B >> T;

  int period = B - A;
  int  ttpc_year = B + period;
  while (true) {
    if (ttpc_year >= T) {
      cout << ttpc_year << endl;
      break;
    } else {
      ttpc_year += period;
    }
  }
}