// 第一回日本最強プログラマー学生選手権-予選-
// B - Kleene Inversion
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int n, k;
  cin >> n >> k;

  vector<int> a(n);
  for (int i = 0; i < n; i++) {cin >> a.at(i);}

  int total = 0;
  int cnt = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      if (a.at(i) > a.at(j)) {
        total++;
      }
    }
  }

  long long int b_total = 0;
  long long int c, d;
  for (int i = 0; i < k; i++) {
    c = k - i;
    d = total * c;
    b_total += total * (k - i);
  }
  cout << b_total % 999999993 << endl;
}