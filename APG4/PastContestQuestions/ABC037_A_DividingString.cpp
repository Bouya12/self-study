// AtCoder Grand Contest 037
// A - Dividing String
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  string s;
  cin >> s;
  
  int s_size = s.size() - 1;
  int k = 1;
  int cur = 1;
  string si;
  string si1;
  si = s.at(0);
  si1 = s.at(1);
  while (cur <= s_size) {
    while (cur <= s_size) {
      if (si != si1) {
          cur++;
          k++;
          si = si1;
          if (cur <= s_size) {
              si1 = s.at(cur);
          }
          break;
      } else {
          cur++;
          if (cur > s_size){
              break;
          }
          si1 += s.at(cur);
      }
    }
  }
  cout << k << endl;
}