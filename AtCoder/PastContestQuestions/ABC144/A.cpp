#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;

  if (a <= 9 && b <=9) {
    cout << a * b << endl;
  } else {
    cout << -1 << endl;
  }
  return 0;
}