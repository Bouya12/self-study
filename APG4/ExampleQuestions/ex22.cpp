#include <bits/stdc++.h>
using namespace std;
using pii = pair<int, int>;
using vpii = vector<pii>;

int main () {
  int N;
  cin >> N;

  vpii p(N);
  for (int i = 0; i < N; i++) {
    int a, b;
    cin >> a >> b;
    p.at(i) = make_pair(b, a);
  }

  sort(p.begin(), p.end());

  for (int i = 0; i < N; i++) {
    int b, a;
    tie(b, a) = p.at(i);
    cout << a << " " << b << endl;
  }
}