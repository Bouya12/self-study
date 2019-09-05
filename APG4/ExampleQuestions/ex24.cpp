#include <bits/stdc++.h>
using namespace std;

struct Clock{
  int hour;
  int minute;
  int second;

  void set (int h, int m, int s) {
    hour = h;
    minute = m;
    second = s;
  }

  string stringify () {
    string time;
    if (hour < 10) {
      time = '0' + to_string(hour);
    } else {
      time = to_string(hour);
    }

    time += ':';
    if (minute < 10) {
      time += '0' + to_string(minute);
    } else {
      time += to_string(minute);
    }

    time += ':';
    if (second < 10) {
      time += '0' + to_string(second);
    } else {
      time += to_string(second);
    }

    return time;
  }

  void change (int diff_second) {
    int total_second = hour * 3600 + minute * 60 + second;
    total_second += diff_second;

    if (total_second < 0) {
      total_second = 24 * 3600 + total_second;
    }

    hour = total_second / 3600;
    if (hour == 24) {
      hour = 0;
    }
    total_second %= 3600;
    minute = total_second / 60;
    total_second %= 60;
    second = total_second;
  }

};

// -------------------
// ここから先は変更しない
// -------------------

int main() {
  // 入力を受け取る
  int hour, minute, second;
  cin >> hour >> minute >> second;
  int diff_second;
  cin >> diff_second;

  // Clock構造体のオブジェクトを宣言
  Clock clock;

  // set関数を呼び出して時刻を設定する
  clock.set(hour, minute, second);

  // 時刻を出力
  cout << clock.stringify() << endl;

  // 時計を進める(戻す)
  clock.change(diff_second);

  // 変更後の時刻を出力
  cout << clock.stringify() << endl;
}
