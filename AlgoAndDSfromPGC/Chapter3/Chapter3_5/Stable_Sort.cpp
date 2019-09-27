#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

vector<string> BubbleSort(vector<string> C, int N) {
  rep (i, N) {
    for (int j = N - 1; j > i; j--) {
      string v = C.at(j);
      if (C.at(j).at(1) < C.at(j - 1).at(1)) {
        C.at(j) = C.at(j - 1);
        C.at(j - 1) = v;
      }
    }
  }

  return C;
}

vector<string> SelectionSort(vector<string> C, int N) {
  rep (i, N) {
    int minj = i;
    for (int j = i; j < N; j++) {
      if (C.at(j).at(1) < C.at(minj).at(1)) minj = j;
    }
    string v = C.at(i);
    C.at(i) = C.at(minj);
    C.at(minj) = v;
  }

  return C;
}

bool isStable(vector<string> c1, vector<string> c2, int N) {
  rep (i, N) {
    if (c1.at(i) != c2.at(i)) return false;
  }

  return true;
}

void Print(vector<string> cards, int N) {
  rep (i, N) {
    if (i > 0) cout << " ";
    cout << cards.at(i);
  }
  cout << endl;
}

int main() {
  int n;
  cin >> n;

  vector<string> cards(n);
  rep (i, n) cin >> cards.at(i);

  vector<string> bubble = BubbleSort(cards, n);
  vector<string> select = SelectionSort(cards, n);

  // Bubble Sort
  Print(bubble, n);
  cout << "Stable" << endl;

  // Select Sort
  Print(select, n);
  if (isStable(bubble, select, n) == true) {
    cout << "Stable" << endl;
  } else {
    cout << "Not stable" << endl;
  }

  return 0;
}