// AtCoder Beginner Contest 076
// B - Addition and Multiplication
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int n, k;
  cin >> n >> k;
  
  int min = 1;
  for (int i = 0; i < n; i++) {
    if (min * 2 < min + k) {
      min = min * 2;
    } else {
      min = min + k;
    }
  }
  
  cout << min << endl;
}