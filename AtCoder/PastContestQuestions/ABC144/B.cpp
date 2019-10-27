#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  cin >> n;

  bool can99 = false;
  rep (i, 10) {
    rep (j, 10) {
      if (i * j == n) {
        can99 = true;
        exit;
      }
    }
    if (can99) {
      exit;
    }
  }

  if (can99) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;    
  }
  
  return 0;
}