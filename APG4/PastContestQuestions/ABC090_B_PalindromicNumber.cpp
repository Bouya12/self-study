// AtCoder Beginner Contest 090
// B - Palindromic Numbers
#include <bits/stdc++.h>
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;
  
  int count = 0;
  for (int i = a; i <= b; i++) {
    if (i/10000 == i%10 && (i/1000)%10 == (i/10)%10) {
      count++;
    }
  }
  
  cout << count << endl;
}