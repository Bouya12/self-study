public class Hero {
  private String name = "�~�i�g";
  private int hp = 100;

  // �키
  public void attack(Matango m) {
    System.out.println(this.name + "�̍U���I");
    m.hp -= 5;
    System.out.println("5�|�C���g�̃_���[�W��^�����I");
  }

  // ������
  public void run() {
    System.out.println(this.name + "�͓����o�����I");
  }
}