#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int p;
  cin >> p;
  int price;
  
  // パターン1
  if (p == 1) {
    cin >> price;
  }
 
  // パターン2
  string text;
  if (p == 2) {
    cin >> text >> price;
    cout << text << "!" << endl;
  }
 
  int N;
  cin >> N;
 
  cout << price * N << endl;
}