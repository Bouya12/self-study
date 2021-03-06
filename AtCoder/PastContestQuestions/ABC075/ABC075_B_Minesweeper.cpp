// AtCoder Beginner Contest 075
// B - Minesweeper
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
  int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

  int h, w;
  cin >> h >> w;

  vector<string> s(h);
  for (int i = 0; i < h; i++) {
    cin >> s.at(i);
  }

  vector<string> ans(h);
  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {

      string mine;
      if (s.at(i).at(j) == '#') {
        mine = '#';
      } else {
        int cnt = 0;
        for (int k = 0; k < 8; k++) {
          if (j + dx[k] >= 0 && j + dx[k] < w 
              && i + dy[k] >= 0 && i + dy[k] < h) {
            if (s.at(i + dy[k]).at(j + dx[k]) == '#') {
              cnt++;
            }
          }
        }
        mine = '0' + cnt;
      }

      if (ans.at(i) == "") {
        ans.at(i) = mine;
      } else {
        ans.at(i) += mine;
      }
    }
  }

  for (int i = 0; i < h; i++) {
    cout << ans.at(i) << endl;
  }
}