// AtCoder Beginner Contest 086
// B - Hina Arare
#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  
  string S;
  string CNT;
  for (int i = 0; i < N; i++) {
    cin >> S;
    if (S == "Y") {
      CNT = "Four";
      break;
    } else {
      CNT = "Three";
    }
  }
  
  cout << CNT << endl;
}