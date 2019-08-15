// AtCoder Beginner Contest 080
// B - Harshad Number
#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  
  string sn = to_string(n);
  
  int len;
  len = sn.length();
  
  int fx = 0;
  for (int i = 0; i < len; i++) {
    fx += sn[i] - '1';
  }
  
  if (n % fx == 0) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }
}