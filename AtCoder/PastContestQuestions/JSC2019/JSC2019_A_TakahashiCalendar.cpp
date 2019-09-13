// 第一回日本最強プログラマー学生選手権-予選-
// A - Takahashi Calendar
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int m, d;
  cin >> m >> d;

  int d1, d10;
  int cnt = 0;
  for (int i = 2; i <= m; i++) {
    for (int j = 22; j <= d; j++) {
      d1 = j % 10;
      if (d1 < 2) {
        continue;
      }
      
      d10 = j / 10;
      if (d1 * d10 == i) {
        cnt++;
        if (d <= i) {
          cnt++;
        }
      }
    }
  }

  cout << cnt << endl;
}