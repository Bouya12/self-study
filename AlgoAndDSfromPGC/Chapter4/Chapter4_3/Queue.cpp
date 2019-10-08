#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
#define LEN 100005
using namespace std;
using proc = pair<string, int>;

vector<proc> Q(LEN);
int head = 1, tail = 1;

// キューに値を追加
void Inqueue(proc process) {
  Q[tail] = process;
  tail = (tail + 1) % LEN;
}

// キューから値を取り出し
proc Dequeue() {
  proc process = Q[head];
  head = (head + 1) % LEN;
  return process;
}

int main() {
  int n, q;
  cin >> n >> q;

  vector<proc> process(n);
  rep (i, n) cin >> process[i].first >> process[i].second;
  tail = n;

  proc u;
  int exe_time;
  while (head != tail) {
    // シミュレーション
  }

  int ans;
  cout << ans << endl;
  return 0;
}