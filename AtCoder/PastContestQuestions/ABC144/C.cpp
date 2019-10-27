#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int64_t n;
  cin >> n;

  int64_t ans = n;
  for (int64_t i = 1; i * i <= n; i++) {
    if (n % i == 0) {
      ans = min(ans, i + n / i - 2);
    }
  }

  cout << ans << endl;

  return 0;
}
