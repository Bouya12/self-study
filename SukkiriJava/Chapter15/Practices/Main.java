/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    String s;
    s = null;
    try {
      System.out.println(s.length());
    } catch (Exception e) {
      System.out.println("NullPointerException ��O�� catch ���܂���");
      System.out.println("�|�|�X�^�b�N�g���[�X�i��������j�|�|");
      e.printStackTrace();
      System.out.println("�|�|�X�^�b�N�g���[�X�i�����܂Łj�|�|");
    }
  }
}