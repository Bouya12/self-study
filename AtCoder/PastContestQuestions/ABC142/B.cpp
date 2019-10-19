#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n, k;
  cin >> n >> k;

  int h[n];
  rep (i, n) cin >> h[i];

  int count = 0;
  rep (i, n) {
    if (h[i] >= k) count++;
  }
  cout << count << endl;

  return 0;
}