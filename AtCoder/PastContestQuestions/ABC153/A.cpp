#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int h, a;
  cin >> h >> a;

  int ans = 0;
  while (h > 0){
    ans++;
    h -= a;
  }
  
  cout << ans << endl;
  return 0;
}