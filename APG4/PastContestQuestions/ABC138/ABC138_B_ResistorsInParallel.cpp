// AtCoder Beginner Contest 138
// B - Resistors in Parallel
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int n;
  cin >> n;
  
  double a;
  double total = 0;
  for (int i; i < n; i++) {
    cin >> a;
    total += 1 / a;
    
  }
  cout << fixed << setprecision(10);
  cout << 1 / total << endl;
}