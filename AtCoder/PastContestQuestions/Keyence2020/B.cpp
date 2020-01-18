#include <bits/stdc++.h>
#define rep(i, n) for(int64_t i = 0; i < (int64_t)(n); i++)
using namespace std;
static const int64_t maxX = 1000000000;

int main() {
  int64_t n;
  cin >> n;
  vector<pair<int64_t, int64_t>> robots(n);
  rep (i, n) {
    cin >> robots.at(i).first >> robots.at(i).second;
  }
  sort(robots.begin(), robots.end());

  vector<int> left(n);
  vector<int> right(n);
  int delRobot = 0;
  rep (i, n) {
    int lx = robots.at(i).first - robots.at(i).second + 1;
    if (lx >= 0) {
      left.at(i) = lx;
    } else {
      left.at(i) = -1;
    }
    int rx = robots.at(i).first + robots.at(i).second - 1;
    if (rx < maxX + 1) {
      right.at(i) = rx;
    } else {
      right.at(i) = maxX + 1;
    }
  }

  int maxRobot = -1;
  while (true) {
    int maxCross = 0;
    rep (i, n) {
      int cross = 0;

      // 左腕が被っている数
      int lhand = left.at(i);
      if (lhand != -2) {
        for (int j = i - 1; j >= 0; j--) {
          if (right.at(j) != -2 && lhand <= right.at(j)) {
            cross++;
          } else {
            break;
          }
        }
      }

      // 右腕が被っている数
      int rhand = right.at(i);
      if (rhand != -2) {
        for (int j = i + 1; j < n; j++) {
          if (left.at(j) != -2 && rhand >= left.at(j)) {
            cross++;
          } else {
            break;
          }
        }
      }

      // 重複数チェック
      if (cross > maxCross) {
        maxCross = cross;
        maxRobot = i;
      }
    }
    if (maxCross == 0) {
      break;
    } else {
      delRobot++;
      left.at(maxRobot) = -2;
      right.at(maxRobot) = -2;
    }
  }

  int ans = n - delRobot;
  cout << ans << endl;
  return 0;
}
