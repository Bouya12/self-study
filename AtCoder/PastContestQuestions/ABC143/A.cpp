#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;

  int ans;
  if (b * 2 >= a) { 
    cout << 0 << endl;
  } else {
    cout << a - b * 2 << endl;
  }
  
  return 0;
}