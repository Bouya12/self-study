#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<string> s(n);
  vector<int> t(n);
  rep (i, n) {
    cin >> s.at(i);
    cin >> t.at(i);
  }
  string x;
  cin >> x;

  int no = 0;
  rep (i, n) { if (s.at(i) == x) no = i; }

  int time = 0;
  for (int i = no + 1; i < n; i++) { time += t.at(i); }

  cout << time << endl;
  return 0;
}