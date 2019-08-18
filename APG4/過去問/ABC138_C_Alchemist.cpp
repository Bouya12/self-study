// AtCoder Beginner Contest 138
// C - Alchemist
#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  
  int v;
  vector<float> value(n);
  for (int i = 0; i < n; i++) {
    cin >> v;
    value.at(i) = v;
  }
  
  float top_val = 0;
  float total_val = 0;
  vector<float> value2(n);
  for (int i = 0; i < n; i++) {
    
    // 配列を複製
    for (int j = 0; j < n; j++) {
      value2.at(j) = value.at(j);
    }
    
    float v1;
    float v2;
    total_val = value2.at(i);
    value2.erase(i);
    while (value2.size() > 1) {
      total_val = (total_val + value2.at(i)) / 2;
      value2.erase(0);
    }
    
    if (top_val < total_val) {
      top_val = total_val;
    }
  }
}