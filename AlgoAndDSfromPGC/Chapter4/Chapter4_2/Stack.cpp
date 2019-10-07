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

  int a, b;
  top = 0;

  while (cin >> in) {
    if (in[0] == '+') {
      a = pop();
      b = pop();
      push(a + b);
    } else if (in[0] == '-') {
      b = pop();
      a = pop();
      push(a - b);
    } else if (in[0] == '*') {
      a = pop();
      b = pop();
      push(a * b);
    } else {
      push(atoi(in.c_str()));
    }
  }

  cout << pop() << endl;

  return 0;
}