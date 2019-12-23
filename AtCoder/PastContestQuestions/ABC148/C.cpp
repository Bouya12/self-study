#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int64_t ggd(int64_t num1, int64_t num2) {
  int64_t a, b;
  if (num1 > num2) {
    a = num1;
    b = num2;
  } else {
    a = num2;
    b = num1;
  }

  int64_t r = a % b;
  while (r != 0) {
    a = b;
    b = r;
    r = a % b;
  }

  return b;
}

int64_t lcm(int64_t num1, int64_t num2) {
  return num1 * num2 / ggd(num1, num2);
}

int main() {
  int64_t a, b;
  cin >> a >> b;

  int64_t ans = lcm(a, b);
  cout << ans << endl;
  return 0;
}