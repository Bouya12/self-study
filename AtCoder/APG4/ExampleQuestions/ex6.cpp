#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int A, B;
  string op;
  int total;
  cin >> A >> op >> B;
 
  if (op == "+") {
    cout << A + B << endl;
  }
  else if (op == "-") {
    cout << A - B << endl;
  }
  else if (op == "*") {
    cout << A * B << endl;
  }
  else if (op == "/") {
    if (B == 0) {
      cout << "error" << endl;
    }
    else {
      total = A / B;
      cout << total << endl;
    }
  }
  else {
    cout << "error" << endl;
  }
}