#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int N, A;
  cin >> N >> A;

  string op;
  int val;
  int total;
  
  for (int i = 1; i <= N; i++) {
    cin >> op >> val;
    
    // 初回なら初期値にAをセット
    if (i == 1) {
      total = A;
    }
  
    // 演算子に従って計算
    if (op == "+") {
      total += val;
    } else if (op == "-") {
      total -= val;
    } else if (op == "*") {
      total *= val;
    } else {
      if (val == 0) {
        cout << "error" << endl;
        break;
      } else {
        total /= val;
      }
    }
   cout << i << ":" << total << endl;
  }
}