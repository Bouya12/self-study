public class AccountTest {
  public static void main(String[] args) {
    testInstratiate();
    testTransfer();
  }
  // ���ۂ�Account��new���Ďg���Ă݂�e�X�g
  private static void testInstratiate() {
    System.out.println("����new�ł��邩�e�X�g���܂�");
    Account a = new Account("�~�i�g", 30000);
    if (!"�~�i�g".equals(a.owner)) {
      System.out.println("���s�I�@���`�l����������");
    }
    if (30000 != a.balance) {
      System.out.println("���s�I�@�c������������");
    }
    System.out.println("�e�X�g���I�����܂�");
  }
  private static void testTransfer() {
    // :
  }
}