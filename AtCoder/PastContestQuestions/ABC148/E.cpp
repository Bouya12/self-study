#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;

int64_t func(int64_t n) {
  if (n < 2) {
    return 1;
  } else {
    return n * func(n - 2);
  }
}

int main() {
  int64_t n;
  cin >> n;

  int64_t number = func(n);
  string seq = to_string(number);
  
  int64_t cnt = 0;
  for (int i = seq.size() - 1; i >= 0; i--) {
    if (seq.at(i) == '0') {
      cnt++;
    } else {
      break;
    }
  }
  cout << cnt << endl;
  return 0;
}