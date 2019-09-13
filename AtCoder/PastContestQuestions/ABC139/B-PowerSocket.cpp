// AtCoder Beginner Contest 139
// B - Power Socket
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int A, B;
  cin >> A >> B;

  int tap = 0;
  int free = 1;
  int add = A - 1;
  while (free < B) {
    if (free == 1) {
      free = A;
    } else {
      free += add;
    }
    tap++;
  }

  cout << tap << endl;
}