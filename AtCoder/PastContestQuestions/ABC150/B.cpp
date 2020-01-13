#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  string s;
  cin >> n >> s;

  int cnt = 0;
  for (int i = 0; i < n - 2; i++) {
    if (s[i] == 'A') {
      if (s[i + 1] == 'B' && s[i + 2] == 'C') {
        cnt++;
        i += 2;
      }
    }
  }
  cout << cnt << endl;
  return 0;
}