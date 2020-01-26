#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int main() {
  int64_t h;
  cin >> h;

  int64_t cnt = 0;
  int64_t divide_cnt = 0;
  while (h > 1) {
    cnt++;
    divide_cnt += pow(2, cnt - 1);
    h /= 2;
  }

  int64_t ans = divide_cnt + pow(2, cnt);
  cout << ans << endl;
  return 0;
}