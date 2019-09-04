#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int N;
  cin >> N;

  map<int, int> num_cnt;
  for (int i = 0; i < N; i++) {
    int A;
    cin >> A;

    if (num_cnt.count(A)) {
      num_cnt.at(A) += 1;
    } else {
      num_cnt[A] = 1;
    }
  }

  int max_num;
  int max_cnt = 0;
  for (pair<int, int> p : num_cnt) {
    int num = p.first;
    int cnt = p.second;

    if (cnt > max_cnt) {
      max_num = num;
      max_cnt = cnt;
    }
  }

  cout << max_num << " " << max_cnt << endl;
}