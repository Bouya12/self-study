#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
#define LEN 100005
using namespace std;

struct proc {
  string p;
  int t;
};

vector<proc> Q(LEN);
int head = 1, tail = 1;

// キューに値を追加
void Enqueue(proc process) {
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

  for (int i = 1; i <= n; i++) cin >> Q[i].p >> Q[i].t;
  tail = n + 1;

  proc u;
  int exe_time = 0, elaps = 0;
  while (head != tail) {
    u = Dequeue();
    exe_time = min(q, u.t);
    u.t -= exe_time;
    elaps += exe_time;
    if (u.t > 0) {
      Enqueue(u);
    } else {
      cout << u.p << " " << elaps << endl;
    }
  }

  return 0;
}