#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using namespace std;

int top, S[1000];

void push(int x) {
  S[++top] = x;
}

int pop() {
  top--;
  return S[top+1];
}

int main() {
  string in;
  getline(cin, in);

  string s = "";
  for (int i = 0; i < in.size(); i += 2) s += in.at(i);

  int a, b;
  top = 0;

  for (int i = 0; i < s.size(); i++) {
    if (s[i] == '+') {
      a = pop();
      b = pop();
      push(a + b);
    } else if (s[i] == '-') {
      b = pop();
      a = pop();
      push(a - b);
    } else if (s[i] == '*') {
      a = pop();
      b = pop();
      push(a * b);
    } else {
      push(s[i] - '0');
    }
  }

  cout << pop() << endl;

  return 0;
}