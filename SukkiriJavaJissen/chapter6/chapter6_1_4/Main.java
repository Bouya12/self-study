import java.util.function.*;
public class Main {
  public static int sub(int a, int b) {
    return a - b;
  }
  public static void main(String[] args) {
    // sub���\�b�h�̏������W�b�N���A�ϐ�func�ɑ������
    IntBinaryOperator func = Main::sub;
    // �ϐ�func�Ɋi�[����Ă��鏈�����W�b�N���A����5��3�Ŏ��s����
    int a = func.applyAsInt(5, 3);
    System.out.println("5-3��" + a);
  }
}