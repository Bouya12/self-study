#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

double culcExpectedValue(int64_t number) {
  double sum = 0;
  for (int64_t i = 1; i <= number; i++) {
    sum += i;
  }
  double exVal = sum / number;
  return sum / number;
}

int main() {
  int64_t n, k;
  cin >> n >> k;
  vector<int64_t> p(n);
  rep (i, n) cin >> p.at(i);

  int maxTotal = 0;
  int startNo, endNo;
  for (int i = 0; i < n - k + 1; i++) {
    int total = 0;
    for (int j = i; j < i + k; j++) total += p.at(j);
    if (total > maxTotal) {
      maxTotal = total;
      startNo = i;
      endNo = i + k;
    }
  }

  double ans = 0.0;
  for (int i = startNo; i < endNo; i++) {
    ans += culcExpectedValue(p.at(i));
  }

  cout << ans << endl;
  return 0;
}
