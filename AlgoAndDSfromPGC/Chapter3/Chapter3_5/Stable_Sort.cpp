#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

string BubbleSort(vector<string> &C, int N) {
  rep (i, N) {
    for (int j = N - 1; j > i; j--) {
      int v = C.at(j);
      if (v < C.at(j - 1)) {
        C.at(j) = C.at(j - 1);
        C.at(j - 1) = v;
      }
    }
  }

  string stable;
  return stable;
}

string SelectionSort(vector<string> &C, int N) {
  rep (i, N) {
    int minj = i;
    for (int j = i; j < N - 1; j++) {
      if (C.at(j) < C.at(minj)) minj = j;
    }
    int v = C.at(i);
    C.at(i) = C.at(minj);
    C.at(minj) = v;
  }

  string stable;
  return stable;
}

int main() {
  int n;
  cin >> n;

  vector<string> cards(n);
  rep (i, n) cin >> cards.at(i);

  BubbleSort(cards, n);
  SelectionSort(cards, n);

  return 0;
}