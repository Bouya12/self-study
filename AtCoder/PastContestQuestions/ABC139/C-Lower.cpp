// AtCoder Beginner Contest 139
// C - Lower
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int N;
  cin >> N;

  vector<int> H(N);
  for (int i = 0; i < N; i++) {
    cin >> H.at(i);
  }

  int max = 0;
  for (int i = 0; i < N; i++) {
    int current = H.at(i);
    int next = i + 1;
    int move = 0;
    while (next < N) {
      if (current >= H.at(next)) {
        current = H.at(next);
        next++;
        move++;
      } else {
        break;
      }
    }
    if (move > max) {
      max = move;
      if (next > N) {
        break;
      } else {
        i = next - 1;
      }
    }
  }

  cout << max << endl;
}
