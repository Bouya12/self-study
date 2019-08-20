// AtCoder Beginner Contest 074
// B - Collecting Balls (Easy Version)
#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, k;
  cin >> n >> k;

  int x;
  int total = 0;
  for (int i = 0; i < n; i++) {
    cin >> x;
    if (x < k - x) {
      total += x * 2;
    } else {
      total += (k - x) * 2;
    }
  }

  cout << total << endl;
}