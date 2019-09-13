#include <bits/stdc++.h>
using namespace std;
 
int main() {
  vector<int> height(3);
  cin >> height.at(0) >> height.at(1) >> height.at(2);
  
  sort(height.begin(), height.end());
  
  cout << height.at(2) - height.at(0) << endl;
}