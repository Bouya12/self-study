#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int main() {
  int n;
  cin >> n;

  double per = n / 2;
  if (n % 2 == 1) per++;
  per /= n;

  cout << per << endl;
  return 0;
}