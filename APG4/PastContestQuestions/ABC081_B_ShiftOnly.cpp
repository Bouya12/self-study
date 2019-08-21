// AtCoder Beginner Contest 081
// B - Shift only
#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  
  vector<int> a(n);
  for (int i = 0; i < n; i++) {cin >> a.at(i);}

  int count = 0;
  bool shift_flg = true;
  while (shift_flg == true) {
    for (int i = 0; i < n; i++) {
      if (a.at(i) % 2 != 0) {
        shift_flg = false;
        break;
      }

      a.at(i) /= 2;
    }

    if (shift_flg == true) {count++;}
  }
  
  cout << count << endl;
}