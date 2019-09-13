#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int A, B;
  cin >> A >> B;
 
  // Aさんの点数
  string a_score = "A:";
  while (A > 0) {
    a_score += "]";
    A--;
  }
  cout << a_score << endl;

  // Bさんの点数
  string b_score = "B:";
  while (B > 0) {
    b_score += "]";
    B--;
  }
  cout << b_score << endl;

}