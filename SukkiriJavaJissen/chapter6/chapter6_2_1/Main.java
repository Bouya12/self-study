import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    // �u2�̈����̍������߂鏈���v�̎��Ԃ𐶂ݏo���A�������
    IntBinaryOperator func = (int a, int b) -> { return a - b; };
    int a = func.applyAsInt(5, 3);
    System.out.println("5-3��" + a);
  }
}