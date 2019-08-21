// AtCoder Beginner Contest 138
// C - Alchemist
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int n;
  cin >> n;
  
  vector<float> v(n);
  for (int i = 0; i < n; i++) {
    cin >> v.at(i);
  }
  sort(v.begin(), v.end());
 
  double value = v.at(0);
  for (int i = 1; i < n; i++) {
    value += v.at(i);
    value /= 2;
  }
 
  cout << value << endl;
}