import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    // 「2つの引数の差を求める処理」の実態を生み出し、代入する
    IntBinaryOperator func = (int a, int b) -> { return a - b; };
    int a = func.applyAsInt(5, 3);
    System.out.println("5-3は" + a);
  }
}