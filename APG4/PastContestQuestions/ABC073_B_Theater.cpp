// AtCoder Beginner Contest 073
// B - Theater
#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  
  int l, r;
  int total = 0;
  for (int i = 0; i < n; i++) {
    cin >> l >> r;
    total += r - l + 1;
  }
  
  cout << total << endl;
}