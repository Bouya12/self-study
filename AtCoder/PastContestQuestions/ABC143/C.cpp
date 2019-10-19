#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  string s;
  cin >> n >> s;

  int total = 1;
  for (int i = 1; i < s.length(); i++) {
    if (s[i] != s[i - 1]) total++;
  }

  cout << total << endl;
  return 0;
}