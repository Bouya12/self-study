// AtCoder Grand Contest 049
// A - 居合を終え、青い絵を覆う / UOIAUAI
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  char c;
  cin >> c;

  if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
    cout << 'vowel';
  } else {
    cout << 'consonant';
  }
}