#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  string s;
  cin >> s;
  reverse(s.begin(), s.end());

  vector<string> div_word = {"dream", "dreamer", "erase", "eraser"};
  rep (i, 4) reverse(div_word.at(i).begin(), div_word.at(i).end());

  bool can = true;
  int cursor = 0;
  while (cursor < s.size()) {
    bool dividable = false;
    rep (i, 4) {
      if (s.substr(cursor, div_word.at(i).size()) == div_word.at(i)) {
        dividable = true;
        cursor += div_word.at(i).size();
      }
    }
    if (dividable == false) {
      can = false;
      break;
    }
  }

  if (can == true) {
    cout << "YES" << endl;
  } else {
    cout << "NO" << endl;
  }
  return 0;
}