#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n, m;
  cin >> n >> m;
  vector<int> p(m);
  vector<string> s(m);
  rep (i, m) {
    cin >> p.at(i) >> s.at(i);
  }

  vector<bool> anser(100001, false);
  vector<int> wa_cnt(100001, 0);
  int ac = 0;
  int wa = 0;
  rep (i, m) {
    if (s.at(i) == "WA") {
      if (anser.at(p.at(i)) == false) {
        wa_cnt.at(p.at(i))++;
      }
    } else {
      if (anser.at(p.at(i)) == false) {
        ac++;
        wa += wa_cnt.at(p.at(i));
        anser.at(p.at(i)) = true;
      }
    }
  }

  cout << ac << ' ' << wa << endl;
  return 0;
}