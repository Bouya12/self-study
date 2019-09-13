#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int n;
  cin >> n;
  
  vector<int> a(n);
  int total = 0;
  for (int i = 0; i < n; i++) {
    cin >> a.at(i);
    total += a.at(i);
  }

  int ave = total / n;
  for (int i = 0; i < n; i++) {
    cout << abs(ave - a.at(i)) << endl;
  }
}