// 第一回日本最強プログラマー学生選手権-予選-
// B - Kleene Inversion
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int n, k;
  cin >> n >> k;

  vector<int> a(n);
  for (int i = 0; i < n; i++) {
    cin >> a.at(i);
  }

  long long int p = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      if (a.at(i) > a.at(j)) {
        p++;
      }
    }
  }

  long long int q = 0;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (a.at(i) > a.at(j)) {
        q++;
      }
    }
  }

  long long int mod = pow(10, 9) + 7;

  long long int p_total = 0;
  p_total = p * k;
  p_total %= mod;

  long long int q_total = 0;
  q_total = k - 1;
  q_total *= k;
  q_total /= 2;
  q_total %= mod;
  q_total *= q;

  long long int total;
  total = p_total + q_total;

  total %= mod;
  cout << total << endl;
}