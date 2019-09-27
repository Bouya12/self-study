#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int cnt;

void insertionSort(vector<int> &A, int n, int g) {
  for (int i = g; i < n; i++) {
    int v = A.at(i);
    int j = i - g;

    while (j >= 0 && A.at(j) > v) {
      A.at(j + g) = A.at(j);
      j -= g;
      cnt++;
    }
    A.at(j + g) = v;
  }
}

void shellSort(vector<int> A, int n) {
  cnt = 0;
  
  // 数列G = {1, 4, 12, 40, 121, 364, 1093, ...} を生成
  vector<int> G;
  int h = 1;
  while (h <= n) {
    G.push_back(h);
    h = 3 * h + 1;
  }
  int m = G.size();
  rep (i, m) insertionSort(A, n, G.at(i));
}

int main() {
  int n;
  cin >> n;

  vector<int> A(n);
  rep (i, n) cin >> A.at(i);

  // シェルソートを使った処理を記述

  return 0;
}