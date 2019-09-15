// AtCoder Beginner Contest 141
// B - Tap Dance
#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  string s;
  cin >> s;

  bool easy = true;
  for (int i = 0; i < s.size(); i += 2) {
    if (!(s.at(i) == 'R' || s.at(i) == 'U' || s.at(i) == 'D')) {
      easy = false;
    }
  }

  for (int i = 1; i < s.size(); i += 2) {
    if (!(s.at(i) == 'L' || s.at(i) == 'U' || s.at(i) == 'D')) {
      easy = false;
    }
  }

  if (easy == true) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }
  
  return 0;
}